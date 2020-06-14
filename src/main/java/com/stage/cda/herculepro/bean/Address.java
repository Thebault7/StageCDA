package com.stage.cda.herculepro.bean;

import java.io.Serializable;

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
public class Address implements Serializable{

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

	public String getaddressName() {
		return addressName;
	}

	public void setaddressName(String addressName) {
		this.addressName = addressName;
	}

	public String getaddressNumber() {
		return addressNumber;
	}

	public void setaddressNumber(String addressNumber) {
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
}
