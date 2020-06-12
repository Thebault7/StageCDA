package com.stage.cda.herculepro.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="articles")
@DiscriminatorColumn(name="types")
@DiscriminatorValue(value="article")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@Component
public class Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="references", length = 20)
	private String reference;
	@ManyToOne(fetch=FetchType.EAGER)
	private Material material;
	@Column(name="descriptions", length = 200)
	private String description;
	
	public Article() {
	}

	public Article(String reference, Material material, String description) {
		this.reference = reference;
		this.material = material;
		this.description = description;
	}

	public Article(int id, String reference, Material material, String description) {
		this.id = id;
		this.reference = reference;
		this.material = material;
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Article [reference=" + reference + ", material=" + material + ", description=" + description + "]";
	}
}
