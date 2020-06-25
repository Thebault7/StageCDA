package com.stage.cda.herculepro.bean;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="customers")
@Component
public class Customer implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="first_names", length = 30)
	private String firstName;
	@Column(name="sirnames", length = 30, nullable=false)
	private String sirName;
	@Column(name="genders", length = 1)
	private String gender;
	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE}, fetch=FetchType.LAZY)
	private Address address;
	@Column(name="customer_reference", length = 20)
	private String customerCode;
	@Column(name="email", length = 50)
	private String email;
	@Column(name="phone", length = 16)
	private String phoneNumber;
	
	public Customer() {
	}

	public Customer(String firstName, String sirName, String gender, Address address, String customerCode, String email, String phoneNumber) {
		this.firstName = firstName;
		this.sirName = sirName;
		this.gender = gender;
		this.address = address;
		this.customerCode = customerCode;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public Customer(int id, String firstName, String sirName, String gender, Address address, String customerCode, String email, String phoneNumber) {
		this.id = id;
		this.firstName = firstName;
		this.sirName = sirName;
		this.gender = gender;
		this.address = address;
		this.customerCode = customerCode;
		this.email = email;
		this.phoneNumber = phoneNumber;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", sirName=" + sirName + ", gender=" + gender
				+ ", address=" + address + ", customerCode=" + customerCode + ", email=" + email + ", phoneNumber="
				+ phoneNumber + "]";
	}
}
