package com.stage.cda.herculepro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.cda.herculepro.bean.User;
import com.stage.cda.herculepro.dao.UserDAO;

@Service(value="userManager")
public class UserManager {

	@Autowired
	UserDAO userDAO;
	
	public User findUser(String pseudo) {
		return userDAO.findOneByPseudo(pseudo);
	}
	
	public void addUser(User user) {
		userDAO.save(user);
	}
	
	public void modifyUser(User user) {
		userDAO. save(user);
	}
	
	public void deleteUser(User user) {
		userDAO.delete(user);
	}
	
	public List<User> listUsers() {
		return userDAO.findAll();
	}
}
