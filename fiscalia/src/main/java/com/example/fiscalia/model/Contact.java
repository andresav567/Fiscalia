package com.example.fiscalia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="contacts")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="CONTACT_ID")
	private int contactId;
	@Column(name ="LAST_NAME")
	private String lastName;
	@ManyToOne()
	@JoinColumn(name="COMPANY_ID")
	private Company companyId;
	@Column(name ="FIRST_NAME")
	private String firstName;
	@Column(name ="POSITION")
	private String position;
	@Column(name ="PHONE")
	private int phone;
	@Column(name ="EXTENSION")
	private int extension;
	@Column(name ="CELL_PHONE")
	private int cellPhone;
	@Column(name ="MAIL")
	private String mail;
	@Column(name ="RESUME")
	private String resume;
	@ManyToOne
	@JoinColumn(name ="CITY_ID")
	private City cityId;
	@Column(name ="CITY")
	private String city;
	@Column(name ="ADDRESS")
	private String address;
	@Column(name ="ZIP")
	private String zip;
	@ManyToOne
	@JoinColumn(name ="EMPLOYEE_ID")
	private Employee employeeId;
	@Column(name ="PUBLIC_ACCOUNT")
	private String publicAccount;
	@Column(name ="STATUS")
	private String status;
	
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getContactId() {
		return contactId;
	}

	public void setContactId(int contactId) {
		this.contactId = contactId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Company getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Company companyId) {
		this.companyId = companyId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public int getExtension() {
		return extension;
	}

	public void setExtension(int extension) {
		this.extension = extension;
	}

	public int getCellPhone() {
		return cellPhone;
	}

	public void setCellPhone(int cellPhone) {
		this.cellPhone = cellPhone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	public City getCityId() {
		return cityId;
	}

	public void setCityId(City cityId) {
		this.cityId = cityId;
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

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	

	public String getPublicAccount() {
		return publicAccount;
	}

	public void setPublicAccount(String publicAccount) {
		this.publicAccount = publicAccount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}




}
