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
import com.stage.cda.herculepro.service.CompanyManager;
import com.stage.cda.herculepro.service.UserManager;
import com.stage.cda.herculepro.utils.PasswordEncoderGenerator;

@Controller
public class AddUserController {

	@Autowired
	UserManager um;
	@Autowired
	PasswordEncoderGenerator peg;
	@Autowired
	CompanyManager cm;
	
	@PostConstruct
	private void init() {
		//TODO: init code
	}
	
	@PreDestroy
    private void shutdown() {
        //TODO: destroy code
    }
	
	@RequestMapping(method = RequestMethod.GET, path = {"/addUser"})
	public ModelAndView addUser(ModelMap modelMap, User user) {
		ModelAndView mav = new ModelAndView("addUser", "user", user);
		if (user.getPseudo() != null) mav.addObject("errorPseudoAlreadyTaken",
				"Ce pseudo est déjà pris, veuillez en choisir un autre.");
		mav.addObject("listCompanies", cm.findByOrderByCompanyNameAsc());
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = {"/validateNewUser"})
	public ModelAndView validateNewUser(ModelMap modelMap, User user) {
		List<User> listUsers = um.listUsers();
		for (int i = 0; i < listUsers.size(); i++) {
			if (listUsers.get(i).getPseudo().equals(user.getPseudo())) {
				return addUser(modelMap, user);
			}
		}
		String hashedPassword = peg.hashing(user.getPassword(), user.getPseudo());
		user.setPassword(hashedPassword);
		um.addUser(user);
		ModelAndView mav = new ModelAndView("connection", "user", user);
		return mav;
	}
}
