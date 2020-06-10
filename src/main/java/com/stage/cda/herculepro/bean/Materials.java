package com.stage.cda.herculepro.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materials implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String matType;
	private float cost;
	
	public Materials() {
	}

	public Materials(String matType, float cost) {
		this.matType = matType;
		this.cost = cost;
	}

	public Materials(int id, String matType, float cost) {
		this.id = id;
		this.matType = matType;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatType() {
		return matType;
	}

	public void setMatType(String matType) {
		this.matType = matType;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Materials [id=" + id + ", matType=" + matType + ", cost=" + cost + "]";
	}
}
