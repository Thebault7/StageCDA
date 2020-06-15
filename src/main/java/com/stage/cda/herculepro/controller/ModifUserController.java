package com.stage.cda.herculepro.controller;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.stage.cda.herculepro.service.UserManager;

@Controller
public class ModifUserController {

	@Autowired
	UserManager userManager;
	
	@PostConstruct
	private void init() {
		//TODO: init code
	}
	
	@PreDestroy
    private void shutdown() {
        //TODO: destroy code
    }
	
	@RequestMapping(method = RequestMethod.GET, path = {"/modifUser"})
	public ModelAndView addUserInitialise (ModelMap modelMap) {
		ModelAndView mav = new ModelAndView("modifUser");
//		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//		System.out.println("_____________________________________________________________");
//		System.out.println(auth.toString());
//		mav.addObject("userName", name);
		return mav;
	}
}
