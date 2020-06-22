package com.stage.cda.herculepro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.cda.herculepro.bean.City;
import com.stage.cda.herculepro.dao.CityDAO;

@Service(value="cityManager")
public class CityManager {

	@Autowired
	CityDAO cityDAO;
	
	public List<City> findByOrderByCityNameAsc() {
		return cityDAO.findByOrderByCityNameAsc();
	}
	
	public City findByCityId(int id) {
		return cityDAO.findOne(id);
	}
	
	public City saveCity(City city) {
		return cityDAO.save(city);
	}
	
	public City findByCityNameAndPostCode(String cityName, String postCode) {
		return cityDAO.findOneByCityNameAndPostCode(cityName, postCode);
	}
}
