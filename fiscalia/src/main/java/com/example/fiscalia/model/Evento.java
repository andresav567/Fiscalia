package com.example.fiscalia.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="eventos")
public class Evento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="EVENT_ID")
	private int eventId;
	@OneToOne
	@JoinColumn(name ="ISSUE_ID")
	private Issue issueId;
	@Column(name ="TITLE")
	private String title;
	@Column(name ="DESCRIPTION")
	private String description;
	@Column(name ="START_DATE")
	private Date startDate;
	@Column(name ="END_DATE")
	private Date endDate;
	@Column(name ="ALL_DAY")
	private String allDay;
	@Column(name ="RECURRING")
	private String recurring;
	@Column(name ="PUBLIC_EVENT")
	private String publicEvent;
	@Column(name ="STATUS")
	private String status;
	@OneToOne
	@JoinColumn(name ="EMPLOYEE_ID")
	private Employee employeeId;

	
	
	
	public Evento() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getEventId() {
		return eventId;
	}




	public void setEventId(int eventId) {
		this.eventId = eventId;
	}




	public Issue getIssueId() {
		return issueId;
	}




	public void setIssueId(Issue issueId) {
		this.issueId = issueId;
	}




	public String getTitle() {
		return title;
	}




	public void setTitle(String title) {
		this.title = title;
	}




	public String getDescription() {
		return description;
	}




	public void setDescription(String description) {
		this.description = description;
	}




	public Date getStartDate() {
		return startDate;
	}




	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}




	public Date getEndDate() {
		return endDate;
	}




	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}




	public String getAllDay() {
		return allDay;
	}




	public void setAllDay(String allDay) {
		this.allDay = allDay;
	}




	public String getRecurring() {
		return recurring;
	}




	public void setRecurring(String recurring) {
		this.recurring = recurring;
	}




	public String getPublicEvent() {
		return publicEvent;
	}




	public void setPublicEvent(String publicEvent) {
		this.publicEvent = publicEvent;
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
