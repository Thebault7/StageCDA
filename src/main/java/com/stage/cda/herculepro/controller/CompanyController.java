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
import com.stage.cda.herculepro.bean.Company;
import com.stage.cda.herculepro.service.AddressManager;
import com.stage.cda.herculepro.service.CityManager;

@Controller
public class CompanyController {

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
	
	@RequestMapping(method = RequestMethod.GET, path = {"/modifCompany"})
	public ModelAndView modifCompany(ModelMap modelMap) {
		ModelAndView mav = new ModelAndView("modifCompany");
		Company company = new Company();
		List<Address> listAddresses = addressManager.findByOrderByAddressNameAsc();
		List<City> listCities = cityManager.findByOrderByCityNameAsc();
		mav.addObject("listAddresses", listAddresses);
		mav.addObject("listCities", listCities);
		mav.addObject("company", company);
		return mav;
	}
}
