package com.stage.cda.herculepro.controller;

import java.util.List;

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

@Controller
public class CustomerController {

	@Autowired
	CustomerManager customerManager;
	@Autowired
	AddressManager addressManager;
	@Autowired
	CityManager cityManager;
	
	@PostConstruct
	private void init() {
		//TODO: init code
	}
	
	@PreDestroy
    private void shutdown() {
        //TODO: destroy code
    }
	
	@RequestMapping(method = RequestMethod.GET, path = {"/customers"})
	public ModelAndView listCustomers(ModelMap modelMap) {
		ModelAndView mav = new ModelAndView("customers");
		List<Customer> listCustomer = customerManager.findByOrderBySirNameAsc();
		mav.addObject("listCustomers", listCustomer);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = {"/editCustomer"})
	public ModelAndView editCustomer(ModelMap modelMap, Integer index) {
		Customer customer = new Customer();
		if (index != null && index > 0) {
			customer = customerManager.findOneById(index);
			List<Address> listAddresses = addressManager.findByOrderByAddressNameAsc();
			ModelAndView mav = new ModelAndView("editCustomer", "customer", customer);
			mav.addObject("listAddresses", listAddresses);
			List<City> listCities = cityManager.findByOrderByCityNameAsc();
			mav.addObject("listCities", listCities);
			mav.addObject("customerIndex", index);
			return mav;
		}
		return new ModelAndView("editCustomer");
	}
}
