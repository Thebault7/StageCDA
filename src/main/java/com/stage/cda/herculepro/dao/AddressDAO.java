package com.stage.cda.herculepro.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stage.cda.herculepro.bean.Address;

@Repository(value="addressDAO")
public interface AddressDAO extends JpaRepository<Address, Integer> {

	List<Address> findByOrderByAddressNameAsc();
	List<Address> findAllByCityId(int id);
	
	@Query(" select a from Address a where a.addressName = ?1 and a.addressNumber = ?2 and a.city.cityName = ?3 and a.city.postCode = ?4 ")
	Optional<Address> findOneAddressByAddressNameAndAddressNumberAndCityNameAndPostCode(
			String addressName, 
			String addressNumber, 
			String cityName, 
			String postCode);
}
