package com.example.fiscalia.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="trial_stages")
public class TrialStage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="TRIAL_STAGE_ID")
	private int trialStageId;
	@ManyToOne
	@JoinColumn(name ="TRIAL_ID")
	private Trial trialId;
	@ManyToOne
	@JoinColumn(name ="STAGE_ID")
	private Stage stageId;
	@ManyToOne
	@JoinColumn(name ="ACTIVITY_ID")
	private Activity activityId;
	@ManyToOne
	@JoinColumn(name ="COURT_ID")
	private Court courtId;
	@ManyToOne
	@JoinColumn(name ="EMPLOYEE_ID")
	private Employee employeeId;
	
	@Column(name ="TITLE")
	private String title;
	
	@Column(name ="DESCRIPTION")
	private String description;
	
	@Column(name ="ANALYSIS")
	private String analyisis;
	
	@Column(name ="ASUMPTIONS")
	private String asumptions;
	
	@Column(name ="PROCESS_TERM")
	private Date processTerm;
	
	@Column(name ="SUBMISSION_DATE")
	private Date submissionDate;
	
	@Column(name ="NOTIFICATION_DATE")
	private Date notificationDate;
	
	@Column(name ="DUE_DATE")
	private Date dueDate;
	
	@Column(name ="STATUS")
	private String status;

	
	
	
	
	public TrialStage() {
		super();
		// TODO Auto-generated constructor stub
	}





	public int getTrialStageId() {
		return trialStageId;
	}





	public void setTrialStageId(int trialStageId) {
		this.trialStageId = trialStageId;
	}





	public Trial getTriadId() {
		return trialId;
	}





	public void setTriadId(Trial triadId) {
		this.trialId = triadId;
	}





	public Stage getStageId() {
		return stageId;
	}





	public void setStageId(Stage stageId) {
		this.stageId = stageId;
	}





	public Activity getActivityId() {
		return activityId;
	}





	public void setActivityId(Activity activityId) {
		this.activityId = activityId;
	}





	public Court getCourtId() {
		return courtId;
	}





	public void setCourtId(Court courtId) {
		this.courtId = courtId;
	}





	public Employee getEmployeeId() {
		return employeeId;
	}





	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
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





	public String getAnalyisis() {
		return analyisis;
	}





	public void setAnalyisis(String analyisis) {
		this.analyisis = analyisis;
	}





	public String getAsumptions() {
		return asumptions;
	}





	public void setAsumptions(String asumptions) {
		this.asumptions = asumptions;
	}





	public Date getProcessTerm() {
		return processTerm;
	}





	public void setProcessTerm(Date processTerm) {
		this.processTerm = processTerm;
	}





	public Date getSubmissionDate() {
		return submissionDate;
	}





	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}





	public Date getNotificationDate() {
		return notificationDate;
	}





	public void setNotificationDate(Date notificationDate) {
		this.notificationDate = notificationDate;
	}





	public Date getDueDate() {
		return dueDate;
	}





	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}






}
