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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="issues")
public class Issue {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ISSUE_ID")
	private int issueId;
	
	@Column(name ="TITLE")
	private String title;
	@Column(name ="DESCRIPTION")
	private String description;
	@Column(name ="START_DATE")
	private Date startDate;
	@Column(name ="END_DATE")
	private Date endDate;
	@Column(name ="PRIORITY")
	private String priority;
	@Column(name ="PROGRESS")
	private int progress;
	@OneToOne
	@JoinColumn(name ="OWNER_ID")
	private Employee ownerId;
	@OneToOne
	@JoinColumn(name ="MANAGER_ID")
	private Employee managerId;
	@Column(name ="STATUS")
	private String status;
	

	@OneToMany(mappedBy = "issueId")
	private Set<Issue> issue = new HashSet<Issue>();

	
	
	
	public Issue() {
		super();
		// TODO Auto-generated constructor stub
	}






	public int getIssueId() {
		return issueId;
	}






	public void setIssueId(int issueId) {
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






	public String getPriority() {
		return priority;
	}






	public void setPriority(String priority) {
		this.priority = priority;
	}






	public int getProgress() {
		return progress;
	}






	public void setProgress(int progress) {
		this.progress = progress;
	}










	public Employee getOwnerId() {
		return ownerId;
	}






	public void setOwnerId(Employee ownerId) {
		this.ownerId = ownerId;
	}






	public Employee getManagerId() {
		return managerId;
	}






	public void setManagerId(Employee managerId) {
		this.managerId = managerId;
	}






	public Set<Issue> getIssue() {
		return issue;
	}






	public void setIssue(Set<Issue> issue) {
		this.issue = issue;
	}






	public String getStatus() {
		return status;
	}






	public void setStatus(String status) {
		this.status = status;
	}






	


}
