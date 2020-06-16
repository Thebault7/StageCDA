package com.stage.cda.herculepro.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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
	@OneToMany(cascade=CascadeType.ALL, orphanRemoval=true, fetch=FetchType.EAGER)
	@Column(name="articles")
	private List<Article> listArticle;
	@Column(name="customers")
	private Customer customer;
	@Column(name="dates")
	private Date date;
	@Column(name="validities")
	private int validityDurationInDays;
	@Column(name="references")
	private String quoteReference;
	
	public Quote() {
	}

	public Quote(List<Article> listArticle, Customer customer, Date date, int validityDurationInDays,
			String quoteReference) {
		super();
		this.listArticle = listArticle;
		this.customer = customer;
		this.date = date;
		this.validityDurationInDays = validityDurationInDays;
		this.quoteReference = quoteReference;
	}

	public Quote(int id, List<Article> listArticle, Customer customer, Date date, int validityDurationInDays,
			String quoteReference) {
		super();
		this.id = id;
		this.listArticle = listArticle;
		this.customer = customer;
		this.date = date;
		this.validityDurationInDays = validityDurationInDays;
		this.quoteReference = quoteReference;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Article> getListArticle() {
		return listArticle;
	}

	public void setListArticle(List<Article> listArticle) {
		this.listArticle = listArticle;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getValidityDurationInDays() {
		return validityDurationInDays;
	}

	public void setValidityDurationInDays(int validityDurationInDays) {
		this.validityDurationInDays = validityDurationInDays;
	}

	public String getQuoteReference() {
		return quoteReference;
	}

	public void setQuoteReference(String quoteReference) {
		this.quoteReference = quoteReference;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Quote [id=" + id + ", listArticle=" + listArticle + ", customer=" + customer + ", date=" + date
				+ ", validityDurationInDays=" + validityDurationInDays + ", quoteReference=" + quoteReference + "]";
	}
}
