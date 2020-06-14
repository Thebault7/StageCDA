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
	
//	public List<City> findByOrderByCityNameAsc() {
//		return cityDAO.findByOrderByCityNameAsc();
//	}
}
