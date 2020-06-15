package com.stage.cda.herculepro.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="quotes")
@Component
public class Quote implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private List<Article> listArticle;
	private Customer customer;
	private Date date;
	private int validityDurationInMonths;
	private String quoteReference;
	
	public Quote() {
	}
	
	
}
