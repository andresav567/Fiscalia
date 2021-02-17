package com.example.fiscalia.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Basic;
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
@Table(name="cities")
public class City {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="CITY_ID")
	private int cityId;
	@Column(name ="CITY_CODE")
	private String cityCode;
	@ManyToOne()
	@JoinColumn(name="PROVINCE_ID")
	private  Province province;
	@Column(name ="CITY_NAME")
	private String cityName;
	@Column(name ="STATUS")
	private String status;
	
	
	

	@JsonIgnore()
	@OneToMany(mappedBy = "cityId")
	private Set<Company> company = new HashSet<Company>();
	
	@JsonIgnore()
	@OneToMany(mappedBy = "cityId")
	private Set<Contact> contact = new HashSet<Contact>();
	
	@JsonIgnore()
	@OneToMany(mappedBy = "cityId")
	private Set<Court> court = new HashSet<Court>();
	
	@JsonIgnore()
	@OneToMany(mappedBy = "cityId")
	private Set<Employee> employee = new HashSet<Employee>();
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public String getCityCode() {
		return cityCode;
	}

	public void setCityCode(String cityCode) {
		this.cityCode = cityCode;
	}

	public Province getProvince() {
		return province;
	}

	public void setProvince(Province province) {
		this.province = province;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Company> getCompany() {
		return company;
	}

	public void setCompany(Set<Company> company) {
		this.company = company;
	}

	public Set<Contact> getContact() {
		return contact;
	}

	public void setContact(Set<Contact> contact) {
		this.contact = contact;
	}

	public Set<Court> getCourt() {
		return court;
	}

	public void setCourt(Set<Court> court) {
		this.court = court;
	}

	public Set<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}




}
