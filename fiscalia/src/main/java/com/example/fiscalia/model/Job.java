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
@Table(name="jobs")
public class Job {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="JOB_ID")
	private int JobId;
	@Column(name ="JOB_NAME")
	private String JobName;
	@Column(name ="JOB_DESCRIPTION")
	private String JobDescription;
	@Column(name ="JOB_AREA_ID")
	private int JobAreaId;
	@ManyToOne
	@JoinColumn(name ="PARENT_JOB")
	private Job parentJob;
	

	@OneToMany(mappedBy = "jobId")
	private Set<Employee> employee = new HashSet<Employee>();
	
	public Job() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getJobId() {
		return JobId;
	}



	public void setJobId(int jobId) {
		JobId = jobId;
	}



	public String getJobName() {
		return JobName;
	}



	public void setJobName(String jobName) {
		JobName = jobName;
	}



	public String getJobDescription() {
		return JobDescription;
	}



	public void setJobDescription(String jobDescription) {
		JobDescription = jobDescription;
	}



	public int getJobAreaId() {
		return JobAreaId;
	}



	public void setJobAreaId(int jobAreaId) {
		JobAreaId = jobAreaId;
	}






	public Job getParentJob() {
		return parentJob;
	}



	public void setParentJob(Job parentJob) {
		this.parentJob = parentJob;
	}



	public Set<Employee> getEmployee() {
		return employee;
	}



	public void setEmployee(Set<Employee> employee) {
		this.employee = employee;
	}



	


}
