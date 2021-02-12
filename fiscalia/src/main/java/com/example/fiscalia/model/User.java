package com.example.fiscalia.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="USER_ID")
	private int userId;
	@Column(name ="PIN")
	private int pin;
	
	@ManyToOne()
	@JoinColumn(name="USER_ROLE_ID")
	private UserRole role;
	@Column(name ="NAME")
	private String name;
	@Column(name ="MAIL")
	private String mail;
	@Column(name ="PASSWORD")
	private String password;
	@Column(name ="USER_ROL")
	private String userRol;
	@Column(name ="ENABLED")
	private String enabled;
	

	@OneToMany(mappedBy = "userId")
	private Set<Employee> employee = new HashSet<Employee>();
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	public UserRole getRole() {
		return role;
	}


	public void setRole(UserRole role) {
		this.role = role;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUserRol() {
		return userRol;
	}


	public void setUserRol(String userRol) {
		this.userRol = userRol;
	}


	public String getEnabled() {
		return enabled;
	}


	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}
	
	
	




}
