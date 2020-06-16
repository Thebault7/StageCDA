package com.stage.cda.herculepro.bean.articles;

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

import com.stage.cda.herculepro.bean.Article;
import com.stage.cda.herculepro.bean.Material;


@Entity
@Table(name="stairs")
@Component
public class Stairs implements Serializable, Article {

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
	@Column(name="prices", length = 12)
	private float price;
	@Column(name="heights", length = 12)
	private float height;
	@Column(name="lengths", length = 12)
	private float length;
	@Column(name="widths", length = 12)
	private float width;
	@Column(name="quantities", length = 6)
	private int quantity;
	
	public Stairs() {
	}

	public Stairs(String reference, Material material, String description, float price, float height, float length,
			float width, int quantity) {
		this.reference = reference;
		this.material = material;
		this.description = description;
		this.price = price;
		this.height = height;
		this.length = length;
		this.width = width;
		this.quantity = quantity;
	}

	public Stairs(int id, String reference, Material material, String description, float price, float height,
			float length, float width, int quantity) {
		this.id = id;
		this.reference = reference;
		this.material = material;
		this.description = description;
		this.price = price;
		this.height = height;
		this.length = length;
		this.width = width;
		this.quantity = quantity;
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

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Stairs [id=" + id + ", reference=" + reference + ", material=" + material + ", description="
				+ description + ", price=" + price + ", height=" + height + ", length=" + length + ", width=" + width
				+ ", quantity=" + quantity + "]";
	}
}
