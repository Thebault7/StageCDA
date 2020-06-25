package com.stage.cda.herculepro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stage.cda.herculepro.bean.Company;
import com.stage.cda.herculepro.dao.CompanyDAO;

@Service(value="companyManager")
public class CompanyManager {

	@Autowired
	CompanyDAO companyDAO;
	
	public List<Company> findByOrderByCompanyNameAsc() {
		return companyDAO.findByOrderByCompanyNameAsc();
	}
	
	public Company findOneById(int id) {
		return companyDAO.getOne(id);
	}
}
