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
import com.stage.cda.herculepro.utils.PasswordEncoderGenerator;

@Controller
public class IndexController {
	
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
	
	@RequestMapping(method = RequestMethod.GET, path = {"/index"})
	public ModelAndView goToIndexPage(ModelMap modelMap) {
		User user = new User();
		ModelAndView mav = new ModelAndView("index", "user", user);
		return mav;
	}
	
	@RequestMapping(value="/validatePassword", method = RequestMethod.POST)
	public String validatePassword(ModelMap modelMap, User user) {
		um.addUser(user);
		PasswordEncoderGenerator peg = new PasswordEncoderGenerator();
		peg.hashing("eee");
		return "addQuote";
	}
}
