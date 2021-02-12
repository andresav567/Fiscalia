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
@Table(name="provinces")
public class Province {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="PROVINCE_ID")
	private int provinceId;
	@ManyToOne
	@JoinColumn(name ="COUNTRY_ID")
	private Country countryId;
	@Column(name ="PROVINCE_CODE")
	private String provinceCode;
	@Column(name ="PROVINCE_NAME")
	private String provinceName;
	@Column(name ="STATUS")
	private String status;

	@OneToMany(mappedBy = "province")
	private Set<City> users = new HashSet<City>();
	
	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getProvinceId() {
		return provinceId;
	}

	public void setProvinceId(int provinceId) {
		this.provinceId = provinceId;
	}

	public Country getCountryId() {
		return countryId;
	}

	public void setCountryId(Country countryId) {
		this.countryId = countryId;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public void setProvinceCode(String provinceCode) {
		this.provinceCode = provinceCode;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<City> getUsers() {
		return users;
	}

	public void setUsers(Set<City> users) {
		this.users = users;
	}





}
