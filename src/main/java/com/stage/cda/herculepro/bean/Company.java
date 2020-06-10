package com.stage.cda.herculepro.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Company {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String companyName;
	private Address address;
	private String phoneNumber;
	private String email;
	private String logo;
	
	public Company() {
	}
}
