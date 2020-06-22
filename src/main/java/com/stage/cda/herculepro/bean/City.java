package com.stage.cda.herculepro.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="cities")
@Component
public class City implements Serializable, Comparable<Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="names", length = 50, nullable=false)
	private String cityName;
	@Column(name="post_codes", length = 7, nullable=false)
	private String postCode;
	
	public City() {
	}

	public City(String cityName, String postCode) {
		this.cityName = cityName;
		this.postCode = postCode;
	}

	public City(int id, String cityName, String postCode) {
		this.id = id;
		this.cityName = cityName;
		this.postCode = postCode;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "City [id=" + id + ", cityName=" + cityName + ", postCode=" + postCode + "]";
	}

	@Override
	public int compareTo(Object object) {
		City compareToCity = (City)object;
		if (this.getCityName().equals(compareToCity.getCityName()) && this.getPostCode().equals(compareToCity.getPostCode())) return 1;
		return 0;
	}
}
