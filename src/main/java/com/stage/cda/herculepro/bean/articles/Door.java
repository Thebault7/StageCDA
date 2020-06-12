package com.stage.cda.herculepro.bean.articles;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.stage.cda.herculepro.bean.Article;

@Entity
@Table(name="doors")
@DiscriminatorValue(value="door")
@Component
public class Door extends Article implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name="prices", length = 12)
	private float price;
	@Column(name="heights", length = 15)
	private float height;
	@Column(name="widths", length = 15)
	private float width;
	
	public Door() {
		super();
	}

	public Door(float price, float height, float width) {
		super();
		this.price = price;
		this.height = height;
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

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Door [price=" + price + ", height=" + height + ", width=" + width + ", id=" + id + ", reference="
				+ reference + ", material=" + material + ", description=" + description + "]";
	}
}
