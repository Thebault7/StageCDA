package com.stage.cda.herculepro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.cda.herculepro.bean.Address;
import com.stage.cda.herculepro.dao.AddressDAO;

@Service(value="addressManager")
public class AddressManager {

	@Autowired
	AddressDAO addressDAO;
	
	public List<Address> findByOrderByAddressNameAsc() {
		return addressDAO.findByOrderByAddressNameAsc();
	}
}
