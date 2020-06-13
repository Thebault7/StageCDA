package com.stage.cda.herculepro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.cda.herculepro.bean.Company;

@Repository(value="cDAO")
public interface CompanyDAO extends JpaRepository<Company, Integer>  {

	List<Company> findByOrderByCompanyNameAsc();
}
