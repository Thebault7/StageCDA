package com.stage.cda.herculepro.controller;

import java.util.ArrayList;
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
	UserManager userManager;
	@Autowired
	PasswordEncoderGenerator peg;
	@Autowired
	CompanyManager companyManager;
	
	@PostConstruct
	private void init() {
		//TODO: init code
	}
	
	@PreDestroy
    private void shutdown() {
        //TODO: destroy code
    }
	
	@RequestMapping(method = RequestMethod.GET, path = {"/addUser"})
	public ModelAndView addUserInitialise (ModelMap modelMap) {
		ModelAndView mav = new ModelAndView("addUser", "user", new User());
		mav.addObject("listCompanies", companyManager.findByOrderByCompanyNameAsc());
		return mav;
	}
	
	
	public ModelAndView addUser(ModelMap modelMap, User user, List<String> error) {
		ModelAndView mav = new ModelAndView("addUser", "user", user);
		mav.addObject("listCompanies", companyManager.findByOrderByCompanyNameAsc());
		String errorMessage = "";
		if (!(error instanceof List<?>)) return mav;
		if (error.contains("pseudoTaken")) errorMessage += "Ce pseudo est déjà pris, veuillez en choisir un autre.<br />";
		if (error.contains("pseudoTooShort")) errorMessage += "Le pseudo choisit est trop court. Minimum 3 caractères<br />";
		if (error.contains("pseudoTooLong")) errorMessage += "Le pseudo choisit est trop long. Maximum 20 caractères<br />";
		if (error.contains("passwordTooShort")) errorMessage += "Le mot de passe est trop court. Minimum 8 caractères<br />";
		if (error.contains("sirnameTooShort")) errorMessage += "Le nom est trop court. Minimum 3 caractères<br />";
		if (error.contains("sirnameTooLong")) errorMessage += "Le nom est trop long. Maximum 30 caractères<br />";
		if (error.contains("firstNameTooShort")) errorMessage += "Le prénom est trop court. Minimum 3 caractères<br />";
		if (error.contains("firstNameTooLong")) errorMessage += "Le prénom est trop long. Maximum 30 caractères<br />";
		if (error.contains("emailNotValid")) errorMessage += "L'email n'est pas valide.<br />";
		if (error.contains("emailTooLong")) errorMessage += "L'email est trop long. Maximum 50 caractères<br />";
		mav.addObject("errorMessage", errorMessage);
		return mav;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = {"/validateNewUser"})
	public ModelAndView validateNewUser(ModelMap modelMap, User user) {
		List<User> listUsers = userManager.listUsers();
		List<String> errorMessages = new ArrayList<>();
		for (int i = 0; i < listUsers.size(); i++) {
			if (listUsers.get(i).getPseudo().equals(user.getPseudo())) {
				errorMessages.add("pseudoTaken");
				break;
			}
		}
		if (user.getPseudo().length() < 3) errorMessages.add("pseudoTooShort");
		if (user.getPseudo().length() > 20) errorMessages.add("pseudoTooLong");
		if (user.getPassword().length() < 8) errorMessages.add("passwordTooShort");
		if (user.getSirName().length() < 3) errorMessages.add("sirnameTooShort");
		if (user.getSirName().length() > 30) errorMessages.add("sirnameTooLong");
		if (user.getFirstName().length() < 3) errorMessages.add("firstNameTooShort");
		if (user.getFirstName().length() > 30) errorMessages.add("firstNameTooLong");
		if (!user.getEmail().contains("@") || !user.getEmail().contains(".")) errorMessages.add("emailNotValid");
		if (user.getEmail().length() > 50) errorMessages.add("emailTooLong");
		if (!errorMessages.isEmpty()) return addUser(modelMap, user, errorMessages);
		String hashedPassword = peg.hashing(user.getPassword(), user.getPseudo());
		user.setPassword(hashedPassword);
		userManager.addUser(user);
		ModelAndView mav = new ModelAndView("connection", "user", user);
		return mav;
	}
}
