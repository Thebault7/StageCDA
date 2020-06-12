package com.stage.cda.herculepro.bean.articles;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.stage.cda.herculepro.bean.Article;
import com.stage.cda.herculepro.bean.Material;


@Entity
@Table(name="stairs")
@DiscriminatorValue(value="stairs")
@Component
public class Stairs extends Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="prices", length = 12)
	private float price;
	@Column(name="heights", length = 12)
	private float height;
	@Column(name="lengths", length = 12)
	private float length;
	@Column(name="widths", length = 12)
	private float width;
	
	public Stairs() {
		super();
	}

	public Stairs(String reference, Material material, String description, float price, float height, float length, float width) {
		super(reference, material, description);
		this.price = price;
		this.height = height;
		this.length = length;
		this.width = width;
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

	@Override
	public String toString() {
		return "Stairs [price=" + price + ", height=" + height + ", length=" + length + ", width=" + width + ", " + super.toString() + "]";
	}
}
