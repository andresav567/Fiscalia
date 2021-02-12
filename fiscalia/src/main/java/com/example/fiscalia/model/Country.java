package com.example.fiscalia.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="countries")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="COUNTRY_ID")
	private int countryId;
	@Column(name ="COUNTRY_CODE")
	private String countryCode;
	@Column(name ="COUNTRY_NAME")
	private String countryName;
	@Column(name ="STATUS")
	private String status;
	
	@OneToMany(mappedBy = "countryId")
	private Set<Province> province = new HashSet<Province>();

	@OneToMany(mappedBy = "countryId")
	private Set<Employee> employee = new HashSet<Employee>();
	
	public Country() {
		super();
		
	}



	public int getCountryId() {
		return countryId;
	}



	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}



	public String getCountryCode() {
		return countryCode;
	}



	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}



	public String getCountryName() {
		return countryName;
	}



	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}





}
