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
@Table(name="companies")
@Component
public class Company implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="names", length = 30, nullable=false)
	private String companyName;
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Address address;
	@Column(name="phone_numbers", length = 16)
	private String phoneNumber;
	@Column(name="emails", length = 40)
	private String email;
	@Column(name="logo_images", length = 60)
	private String logo;
	@Column(name="types", length = 10)
	private String type;
	@Column(name="funds", length = 10)
	private int fund;
	@Column(name="sirets", length = 16)
	private String siret;
	@Column(name="codes", length = 15)
	private String code;
	
	public Company() {
	}

	public Company(String companyName, Address address, String phoneNumber, String email, String logo) {
		this.companyName = companyName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.logo = logo;
	}

	public Company(int id, String companyName, Address address, String phoneNumber, String email, String logo) {
		this.id = id;
		this.companyName = companyName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.logo = logo;
	}

	public Company(int id, String companyName, Address address, String phoneNumber, String email, String logo,
			String type, int fund, String siret, String code) {
		this.id = id;
		this.companyName = companyName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.logo = logo;
		this.type = type;
		this.fund = fund;
		this.siret = siret;
		this.code = code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getFund() {
		return fund;
	}

	public void setFund(int fund) {
		this.fund = fund;
	}

	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String toString() {
		return "Company [id=" + id + ", companyName=" + companyName + ", address=" + address + ", phoneNumber="
				+ phoneNumber + ", email=" + email + ", logo=" + logo + ", type=" + type + ", fund=" + fund + ", siret="
				+ siret + ", code=" + code + "]";
	}
}
