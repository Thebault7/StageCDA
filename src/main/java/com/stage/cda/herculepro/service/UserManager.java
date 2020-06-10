package com.stage.cda.herculepro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.cda.herculepro.bean.User;
import com.stage.cda.herculepro.dao.UserDAO;

@Service(value="um")
public class UserManager {

	@Autowired
	UserDAO uDAO;
	
	public User findUser(String pseudo) {
		return uDAO.findOneByPseudo(pseudo);
	}
}
