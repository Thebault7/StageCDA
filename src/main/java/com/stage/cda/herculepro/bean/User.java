package com.stage.cda.herculepro.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.springframework.stereotype.Component;

@Entity
@Table(name="users", uniqueConstraints = {@UniqueConstraint(columnNames = {"pseudo"})})
@Component
public class User implements Serializable, Comparable<Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="password", length = 64, nullable=false)
	private String password;
	@Column(name="pseudo", length = 20, nullable=false)
	private String pseudo;
	@Column(name="sirnames", length = 30)
	private String sirName;
	@Column(name="first_names", length = 30)
	private String firstName;
	@Column(name="emails", length = 50)
	private String email;
	@ManyToOne(fetch=FetchType.LAZY)
	private Company company;
	
	public User() {
	}
	
	public User(String password, String pseudo, String sirName, String firstName, String email, Company company) {
		this.password = password;
		this.pseudo = pseudo;
		this.sirName = sirName;
		this.firstName = firstName;
		this.email = email;
		this.company = company;
	}

	public User(int id, String password, String pseudo, String sirName, String firstName, String email,
			Company company) {
		this.id = id;
		this.password = password;
		this.pseudo = pseudo;
		this.sirName = sirName;
		this.firstName = firstName;
		this.email = email;
		this.company = company;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getSirName() {
		return sirName;
	}

	public void setSirName(String sirName) {
		this.sirName = sirName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", pseudo=" + pseudo + ", sirName=" + sirName
				+ ", firstName=" + firstName + ", email=" + email + ", company=" + company + "]";
	}

	@Override
	public int compareTo(Object object) {
		User compareToUser = (User)object;
		if (this.getPseudo().equals(compareToUser.getPseudo()) && this.getPassword().equals(compareToUser.getPassword())) return 1;
		return 0;
	}
}
