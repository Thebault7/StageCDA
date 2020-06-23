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
@Table(name="adresses")
@Component
public class Address implements Serializable, Comparable<Object>{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="names", length = 50, nullable=false)
	private String addressName;
	@Column(name="numbers", length = 7)
	private String addressNumber;
	@ManyToOne(fetch=FetchType.EAGER)
	private City city;
	
	public Address() {
	}

	public Address(String addressName, String addressNumber) {
		this.addressName = addressName;
		this.addressNumber = addressNumber;
	}

	public Address(String addressName, String addressNumber, City city) {
		this.addressName = addressName;
		this.addressNumber = addressNumber;
		this.city = city;
	}

	public Address(int id, String addressName, String addressNumber, City city) {
		this.id = id;
		this.addressName = addressName;
		this.addressNumber = addressNumber;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddressName() {
		return addressName;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", addressName=" + addressName + ", addressNumber=" + addressNumber + ", city=" + city
				+ "]";
	}

	@Override
	public int compareTo(Object object) {
		Address compareToAddress = (Address)object;
		if (this.getAddressName().equals(compareToAddress.getAddressName())
				&& this.getAddressNumber().equals(compareToAddress.getAddressNumber())
				&& this.getCity().getCityName().equals(compareToAddress.getCity().getCityName())
				&& this.getCity().getPostCode().equals(compareToAddress.getCity().getPostCode())) return 1;
		return 0;
	}
}
