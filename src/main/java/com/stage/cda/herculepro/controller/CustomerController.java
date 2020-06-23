package com.stage.cda.herculepro.controller;

import java.util.List;
import java.util.Optional;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.stage.cda.herculepro.bean.Address;
import com.stage.cda.herculepro.bean.City;
import com.stage.cda.herculepro.bean.Customer;
import com.stage.cda.herculepro.service.AddressManager;
import com.stage.cda.herculepro.service.CityManager;
import com.stage.cda.herculepro.service.CustomerManager;
import com.stage.cda.herculepro.utils.checkIfListContainsAnEntity;

@Controller
public class CustomerController {

	@Autowired
	CustomerManager customerManager;
	@Autowired
	AddressManager addressManager;
	@Autowired
	CityManager cityManager;
	@Autowired
	checkIfListContainsAnEntity<City> cilcaeCity;
	@Autowired
	checkIfListContainsAnEntity<Address> cilcaeAddress;

	@PostConstruct
	private void init() {
		// TODO: init code
	}

	@PreDestroy
	private void shutdown() {
		// TODO: destroy code
	}

	@RequestMapping(method = RequestMethod.GET, path = { "/customers" })
	public ModelAndView listCustomers(ModelMap modelMap) {
		ModelAndView mav = new ModelAndView("customers");
		List<Customer> listCustomer = customerManager.findByOrderBySirNameAsc();
		mav.addObject("listCustomers", listCustomer);
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, path = { "/editCustomer" })
	public ModelAndView editCustomer(ModelMap modelMap, Integer index) {
		if (index != null && index > 0) {
			Customer customer = customerManager.findOneById(index);
			if (customer.getCustomerCode() == null) {
				customer.setCustomerCode("Inconnu");
			}

			Address address = new Address();
			if (customer.getAddress() == null) {
				customer.setAddress(new Address("", ""));
			} else {
				address = addressManager.findByAddressId(customer.getAddress().getId());
			}

			City city = new City();
			if (customer.getAddress().getCity() == null) {
				customer.getAddress().setCity(new City("", ""));
			} else {
				city = cityManager.findByCityId(customer.getAddress().getCity().getId());
			}

			List<Address> listAddresses = addressManager.findByOrderByAddressNameAsc();
			List<City> listCities = cityManager.findByOrderByCityNameAsc();

			ModelAndView mav = new ModelAndView("editCustomer", "customer", customer);
			mav.addObject("customerIndex", index);
			mav.addObject("address", address);
			mav.addObject("listAddresses", listAddresses);
			mav.addObject("city", city);
			mav.addObject("listCities", listCities);

			return mav;
		}
		return new ModelAndView("customers");
	}

	@RequestMapping(method = RequestMethod.POST, path = { "/validateCustomerModif" })
	public ModelAndView validateCustomerModif(ModelMap modelMap, Customer customer) {
		List<City> listCities = cityManager.findByOrderByCityNameAsc();
		City city = customer.getAddress().getCity();
		if (!cilcaeCity.checkList(listCities, city)) {
			customer.getAddress().setCity(cityManager.saveCity(city));
		} else {
			City correspondingCityInDataBase = cityManager.findByCityNameAndPostCode(city.getCityName(), city.getPostCode());
			customer.getAddress().getCity().setId(correspondingCityInDataBase.getId());
		}
		
		List<Address> listAddresses = addressManager.findByOrderByAddressNameAsc();
		Address address = customer.getAddress();
		if (!cilcaeAddress.checkList(listAddresses, address)) {
			Address add = addressManager.saveAddress(address);
			customer.setAddress(add);
		} else {
			Optional<Address> optAddress = addressManager.findOneAddressByAddressNameAndAddressNumberAndCityNameAndPostCode(
										address.getAddressName(),
										address.getAddressNumber(),
										address.getCity().getCityName(),
										address.getCity().getPostCode());
			customer.setAddress(optAddress.get());
		}
		
		customerManager.saveCustomer(customer);
		
		ModelAndView mav = new ModelAndView("customers");
		List<Customer> listCustomer = customerManager.findByOrderBySirNameAsc();
		mav.addObject("listCustomers", listCustomer);
		return mav;
	}

	@RequestMapping(method = RequestMethod.GET, path = { "/addCustomer" })
	public ModelAndView addCustomer(ModelMap modelMap) {
		ModelAndView mav = new ModelAndView("addCustomer", "customer", new Customer());
		List<Address> listAddresses = addressManager.findByOrderByAddressNameAsc();
		List<City> listCities = cityManager.findByOrderByCityNameAsc();
		mav.addObject("listAddresses", listAddresses);
		mav.addObject("listCities", listCities);
		return mav;
	}

//	public void validateNewCustomer(ModelMap modelMap) {
//		// TODO
//	}
}
