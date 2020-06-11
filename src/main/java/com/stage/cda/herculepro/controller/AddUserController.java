package com.stage.cda.herculepro.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.stage.cda.herculepro.bean.User;
import com.stage.cda.herculepro.service.UserManager;

@Controller
public class AddUserController {

	@Autowired
	UserManager um;
	
	@PostConstruct
	private void init() {
		//TODO: init code
	}
	
	@PreDestroy
    private void shutdown() {
        //TODO: destroy code
    }
	
	@RequestMapping(method = RequestMethod.GET, path = {"/addUser"})
	public ModelAndView addUser(ModelMap modelMap) {
		User user = new User();
		ModelAndView mav = new ModelAndView("addUser", "user", user);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = {"/validateUser"})
	public String validateUser(ModelMap modelMap, User user) {
		um.addUser(user);
		return "addQuote";
	}
}
