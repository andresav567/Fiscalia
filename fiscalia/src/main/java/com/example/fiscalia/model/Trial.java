package com.example.fiscalia.model;

import java.sql.Date;
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
@Table(name = "trials")
public class Trial {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TRIAL_ID")
	private int trialId;
	@Column(name = "TITLE")
	private String title;
	@Column(name = "DESCRIPTION")
	private String description;
	@ManyToOne
	@JoinColumn(name = "PROCESS_TYPE_ID")
	private ProcessType processTypeId;
	@ManyToOne
	@JoinColumn(name = "ATTORNEY_ID")
	private Company attornerId;
	@ManyToOne
	@JoinColumn(name = "COMPANY_ID")
	private Company companyId;
	@ManyToOne
	@JoinColumn(name = "EMPLOYEE_ID")
	private Employee employeeId;
	@ManyToOne
	@JoinColumn(name = "COURT_ID")
	private Court courtId;
	@Column(name = "ANALYSIS")
	private String analysis;
	@Column(name = "ASUMPTIONS")
	private String asumptions;
	@Column(name = "SUBMISSION_DATE")
	private Date submissionDate;
	@Column(name = "END_DATE")
	private Date endDate;
	@Column(name = "NOTIFICATION_DATE")
	private Date notificationDate;
	@Column(name = "DUE_DATE")
	private Date dueDate;
	@Column(name = "PROGRESS")
	private int progress;
	@Column(name = "STATUS")
	private String status;

	@OneToMany(mappedBy = "trialId")
	private Set<File> file = new HashSet<File>();
	
	@OneToMany(mappedBy = "trialId")
	private Set<TrialStage> trialStage = new HashSet<TrialStage>();
	@OneToMany(mappedBy = "trialId")
	private Set<Note> note = new HashSet<Note>();
	
	@OneToMany(mappedBy = "trialId")
	private Set<Schedule> schedule = new HashSet<Schedule>();
	
	
	public Trial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTrialId() {
		return trialId;
	}

	public void setTrialId(int trialId) {
		this.trialId = trialId;
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

	


	public Company getAttornerId() {
		return attornerId;
	}

	public void setAttornerId(Company attornerId) {
		this.attornerId = attornerId;
	}

	
	public Company getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Company companyId) {
		this.companyId = companyId;
	}



	public ProcessType getProcessTypeId() {
		return processTypeId;
	}

	public void setProcessTypeId(ProcessType processTypeId) {
		this.processTypeId = processTypeId;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

	public Court getCourtId() {
		return courtId;
	}

	public void setCourtId(Court courtId) {
		this.courtId = courtId;
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

	public Date getSubmissionDate() {
		return submissionDate;
	}

	public void setSubmissionDate(Date submissionDate) {
		this.submissionDate = submissionDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
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

	public int getProgress() {
		return progress;
	}

	public void setProgress(int progress) {
		this.progress = progress;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Set<File> getFile() {
		return file;
	}

	public void setFile(Set<File> file) {
		this.file = file;
	}

	public Set<TrialStage> getTrialStage() {
		return trialStage;
	}

	public void setTrialStage(Set<TrialStage> trialStage) {
		this.trialStage = trialStage;
	}

	public Set<Note> getNote() {
		return note;
	}

	public void setNote(Set<Note> note) {
		this.note = note;
	}

	public Set<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}
	
	

}
