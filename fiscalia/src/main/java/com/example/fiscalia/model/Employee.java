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
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="employees")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="EMPLOYEE_ID")
	private int employeeId;
	@Column(name ="EMPLOYEE_CODE")
	private String employeeCode;
	@Column(name ="LAST_NAME")
	private String lastName;
	@Column(name ="FIRST_NAME")
	private String firstName;
	@ManyToOne
	@JoinColumn(name ="COUNTRY_ID")
	private Country countryId;
	@ManyToOne
	@JoinColumn(name ="CITY_ID")
	private City cityId;
	@Column(name ="CITY")
	private String city;
	@Column(name ="ADDRESS")
	private String address;
	@Column(name ="PHONE")
	private int phone;
	@Column(name ="EXTENSION")
	private int extension;
	@Column(name ="CELL_PHONE")
	private int cellPhone;
	@Column(name ="OTHER_PHONE")
	private int otherPhone;
	@ManyToOne
	@JoinColumn(name ="JOB_ID")
	private Job jobId;
	@Column(name ="MAIL")
	private String mail;
	@Column(name ="ENABLED")
	private String enabled;
	@OneToOne
	@JoinColumn(name ="USER_ID")
	private User userId;
	@Column(name ="STATUS")
	private String status;
	
	@OneToMany(mappedBy = "employeeId")
	private Set<Contact> contact = new HashSet<Contact>();
	
	@OneToMany(mappedBy = "employeeId")
	private Set<Evento> evento = new HashSet<Evento>();
	
	@OneToMany(mappedBy = "ownerId")
	private Set<Issue> owner = new HashSet<Issue>();
	
	@OneToMany(mappedBy = "managerId")
	private Set<Issue> manager = new HashSet<Issue>();
	
	@OneToMany(mappedBy = "employeeId")
	private Set<Schedule> schedule = new HashSet<Schedule>();
	
	@OneToMany(mappedBy = "employeeId")
	private Set<TrialStage> trialStage = new HashSet<TrialStage>();
	
	@OneToMany(mappedBy = "employeeId")
	private Set<TrialTeam> trialTeam = new HashSet<TrialTeam>();

	
	@OneToMany(mappedBy = "employeeId")
	private Set<Trial> trial = new HashSet<Trial>();
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}



	public String getEmployeeCode() {
		return employeeCode;
	}



	public void setEmployeeCode(String employeeCode) {
		this.employeeCode = employeeCode;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public Country getCountryId() {
		return countryId;
	}



	public void setCountryId(Country countryId) {
		this.countryId = countryId;
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



	public int getOtherPhone() {
		return otherPhone;
	}



	public void setOtherPhone(int otherPhone) {
		this.otherPhone = otherPhone;
	}



	public Job getJobId() {
		return jobId;
	}



	public void setJobId(Job jobId) {
		this.jobId = jobId;
	}



	public String getMail() {
		return mail;
	}



	public void setMail(String mail) {
		this.mail = mail;
	}



	public String getEnabled() {
		return enabled;
	}



	public void setEnabled(String enabled) {
		this.enabled = enabled;
	}



	public User getUserId() {
		return userId;
	}



	public void setUserId(User userId) {
		this.userId = userId;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	public Set<Contact> getContact() {
		return contact;
	}



	public void setContact(Set<Contact> contact) {
		this.contact = contact;
	}



	public Set<Evento> getEvento() {
		return evento;
	}



	public void setEvento(Set<Evento> evento) {
		this.evento = evento;
	}



	public Set<Issue> getOwner() {
		return owner;
	}



	public void setOwner(Set<Issue> owner) {
		this.owner = owner;
	}



	public Set<Issue> getManager() {
		return manager;
	}



	public void setManager(Set<Issue> manager) {
		this.manager = manager;
	}



	public Set<Schedule> getSchedule() {
		return schedule;
	}



	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}



	public Set<TrialStage> getTrialStage() {
		return trialStage;
	}



	public void setTrialStage(Set<TrialStage> trialStage) {
		this.trialStage = trialStage;
	}



	public Set<TrialTeam> getTrialTeam() {
		return trialTeam;
	}



	public void setTrialTeam(Set<TrialTeam> trialTeam) {
		this.trialTeam = trialTeam;
	}



}
