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
@Table(name="schedules")
public class Schedule {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="SCHEDULE_ID")
	private int scheduleId;
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
	private String analysis;
	@Column(name ="ASUMPTIONS")
	private String asumptions;
	@Column(name ="PROCESS_TERM")
	private String processTerm;
	@Column(name ="SUBMISSION_DATE")
	private String submissionDate;
	@Column(name ="NOTIFICATION_DATE")
	private String notificationDate;
	@Column(name ="DUE_DATE")
	private String dueDate;
	@Column(name ="STATUS")
	private String status;
	
	@OneToMany(mappedBy = "scheduleId")
	private Set<Schedule> schedule = new HashSet<Schedule>();
	
	
	public Schedule() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getScheduleId() {
		return scheduleId;
	}




	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}




	public Trial getTrialId() {
		return trialId;
	}




	public void setTrialId(Trial trialId) {
		this.trialId = trialId;
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




	public String getAnalysis() {
		return analysis;
	}




	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}




	public String getAsumptions() {
		return asumptions;
	}




	public void setAsumptions(String asumptions) {
		this.asumptions = asumptions;
	}




	public String getProcessTerm() {
		return processTerm;
	}




	public void setProcessTerm(String processTerm) {
		this.processTerm = processTerm;
	}




	public String getSubmissionDate() {
		return submissionDate;
	}




	public void setSubmissionDate(String submissionDate) {
		this.submissionDate = submissionDate;
	}




	public String getNotificationDate() {
		return notificationDate;
	}




	public void setNotificationDate(String notificationDate) {
		this.notificationDate = notificationDate;
	}




	public String getDueDate() {
		return dueDate;
	}




	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}




	public String getStatus() {
		return status;
	}




	public void setStatus(String status) {
		this.status = status;
	}




	public Set<Schedule> getSchedule() {
		return schedule;
	}




	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}




}
