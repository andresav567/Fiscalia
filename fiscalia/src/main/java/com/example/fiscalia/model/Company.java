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


@Entity
@Table(name="companies")
public class Company {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="COMPANY_ID")
	private int companyId;
	@Column(name ="COMPANY_CODE")
	private String companyCode;
	@ManyToOne
	@JoinColumn(name="CITY_ID")
	private City cityId;
	@Column(name ="COMPANY_NAME")
	private String companyName;
	@Column(name ="COMPANY_TYPE")
	private String companyType;
	@Column(name ="CITY")
	private String city;
	@Column(name ="ADDRESS")
	private String address;
	@Column(name ="PHONE")
	private int phone;
	@Column(name ="FAX")
	private int fax;
	@Column(name ="MAIL")
	private String mail;
	@Column(name ="STATUS")
	private String status;
	
	@OneToMany(mappedBy = "companyId")
	private Set<Contact> users = new HashSet<Contact>();
	
	@OneToMany(mappedBy = "companyId")
	private Set<Trial> company = new HashSet<Trial>();
	
	@OneToMany(mappedBy = "attornerId")
	private Set<Trial> attorney = new HashSet<Trial>();
	
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public City getCityid() {
		return cityId;
	}

	public void setCityid(City cityid) {
		this.cityId = cityid;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyType() {
		return companyType;
	}

	public void setCompanyType(String companyType) {
		this.companyType = companyType;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getFax() {
		return fax;
	}

	public void setFax(int fax) {
		this.fax = fax;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<Contact> getUsers() {
		return users;
	}

	public void setUsers(Set<Contact> users) {
		this.users = users;
	}



}
