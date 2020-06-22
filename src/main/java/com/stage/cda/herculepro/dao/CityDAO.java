package com.stage.cda.herculepro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.cda.herculepro.bean.City;

@Repository(value="cityDAO")
public interface CityDAO extends JpaRepository<City, Integer> {

	List<City> findByOrderByCityNameAsc();
	City findOneByCityNameAndPostCode(String cityName, String postCode);
}
