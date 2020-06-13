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
	private String streetName;
	@Column(name="numbers", length = 7)
	private String streetNumber;
	@ManyToOne(fetch=FetchType.EAGER)
	private City city;
	
	public Address() {
	}

	public Address(String streetName, String streetNumber, City city) {
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.city = city;
	}

	public Address(int id, String streetName, String streetNumber, City city) {
		this.id = id;
		this.streetName = streetName;
		this.streetNumber = streetNumber;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", streetName=" + streetName + ", streetNumber=" + streetNumber + ", city=" + city
				+ "]";
	}
}
