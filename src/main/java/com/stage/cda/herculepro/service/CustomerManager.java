package com.stage.cda.herculepro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.cda.herculepro.bean.Customer;
import com.stage.cda.herculepro.dao.CustomerDAO;

@Service(value="customerManager")
public class CustomerManager {

	@Autowired
	CustomerDAO customerDAO;
	
	public List<Customer> findByOrderBySirNameAsc() {
		return customerDAO.findByOrderBySirNameAsc();
	}
	
	public Customer findOneById(int id) {
		return customerDAO.findOne(id);
	}
}
