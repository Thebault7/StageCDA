package com.stage.cda.herculepro.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Article {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int id;
	public int price;
	public String reference;
	public Material material;
	
	public Article() {
	}
}
