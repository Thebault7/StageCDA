package com.stage.cda.herculepro.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stage.cda.herculepro.bean.Customer;

@Repository(value="customerDAO")
public interface CustomerDAO extends JpaRepository<Customer, Integer> {

	List<Customer> findByOrderBySirNameAsc();
}
