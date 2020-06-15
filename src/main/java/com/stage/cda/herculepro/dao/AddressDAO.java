package com.stage.cda.herculepro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.cda.herculepro.bean.Address;

@Repository(value="addressDAO")
public interface AddressDAO extends JpaRepository<Address, Integer> {

	List<Address> findByOrderByAddressNameAsc();
	List<Address> findAllByCityId(int id);
}
