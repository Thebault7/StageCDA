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

import com.stage.cda.herculepro.bean.User;
import com.stage.cda.herculepro.service.UserManager;
import com.stage.cda.herculepro.utils.PasswordEncoderGenerator;
import com.stage.cda.herculepro.utils.CheckIfListContainsAnEntity;

@Controller
//@RequestMapping("/sessionattributes")
//@SessionAttributes("user")
public class ConnectionController<T> {
	
	@Autowired
	UserManager userManager;
	@Autowired
	PasswordEncoderGenerator peg;
	@Autowired
	CheckIfListContainsAnEntity<User> cilcae;
	
	@PostConstruct
	private void init() {
		//TODO: init code
	}
	
	@PreDestroy
    private void shutdown() {
        //TODO: destroy code
    }
	
	@RequestMapping(method = RequestMethod.GET, path = {"/index"})
	public void goToIndexPage(ModelMap modelMap) {
	}
	
	@RequestMapping(method = RequestMethod.GET, path = {"/connection"})
	public ModelAndView enterPassword(ModelMap modelMap) {
		User user = new User();
		ModelAndView mav = new ModelAndView("connection", "user", user);
		return mav;
	}
	
	@RequestMapping(value="/validatePassword", method = RequestMethod.POST)
	public ModelAndView validatePassword(ModelMap modelMap, User user) {
		String hashedPassword = peg.hashing(user.getPassword(), user.getPseudo());
		user.setPassword(hashedPassword);
		List<User> listUsers = userManager.listUsers();
		if (cilcae.checkList(listUsers, user)) {
			ModelAndView mav = new ModelAndView("mainPage", "user", user);
			return mav;
		}
		ModelAndView mav = new ModelAndView("connection", "user", user);
		mav.addObject("errorIdentification", "Les identifiants entrés sont invalides.");
		return mav;
	}
	
//	// Declare a bean by a method, useful to for @SessionAttribute
//	@ModelAttribute("user")
//	public User user() {
//		return new User();
//	}
}
