package com.stage.cda.herculepro.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String firstName;
	private String sirName;
	private Address address;
	private String customerCode;
	
	public Customer() {
	}

	public Customer(String firstName, String sirName, Address address, String customerCode) {
		this.firstName = firstName;
		this.sirName = sirName;
		this.address = address;
		this.customerCode = customerCode;
	}

	public Customer(int id, String firstName, String sirName, Address address, String customerCode) {
		this.id = id;
		this.firstName = firstName;
		this.sirName = sirName;
		this.address = address;
		this.customerCode = customerCode;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSirName() {
		return sirName;
	}

	public void setSirName(String sirName) {
		this.sirName = sirName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", sirName=" + sirName + ", address=" + address
				+ "]";
	}
}
