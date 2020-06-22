package com.stage.cda.herculepro.service;

import java.util.List;
import java.util.Optional;

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
	
	public List<Address> findAllByCityId(int id) {
		return addressDAO.findAllByCityId(id);
	}
	
	public Address findByAddressId(int id) {
		return addressDAO.findOne(id);
	}
	
	public Address saveAddress(Address address) {
		return addressDAO.save(address);
	}
	
	public Optional<Address> findOneAddressByAddressNameAndAddressNumberAndCityNameAndPostCode(String addressName, String addressNumber, String cityName, String postCode) {
		return addressDAO.findOneAddressByAddressNameAndAddressNumberAndCityNameAndPostCode(addressName, addressNumber, cityName, postCode);
	}
}
