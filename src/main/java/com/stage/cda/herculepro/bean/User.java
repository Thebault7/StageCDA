package com.stage.cda.herculepro.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="users", uniqueConstraints = {@UniqueConstraint(columnNames = {"pseudo"})})
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String password;
	
	@Column(name="pseudo")
	private String pseudo;
	
	public User() {
	}

	public User(String password, String pseudo) {
		this.password = password;
		this.pseudo = pseudo;
	}

	public User(int id, String password, String pseudo) {
		this.id = id;
		this.password = password;
		this.pseudo = pseudo;
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

	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", pseudo=" + pseudo + "]";
	}
}
