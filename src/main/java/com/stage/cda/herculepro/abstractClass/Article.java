package com.stage.cda.herculepro.abstractClass;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import com.stage.cda.herculepro.bean.Material;

@Entity
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class Article {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	protected int id;
	protected String reference;
	protected Material material;
	protected String description;
	
	public Article() {
	}
}
