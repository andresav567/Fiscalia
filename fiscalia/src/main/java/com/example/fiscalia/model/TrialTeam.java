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
@Table(name="trial_team")
public class TrialTeam {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="TRIAL_TEAM_ID")
	private int trialTeamId;
	@Column(name ="TRIAL_ID")
	private int trialId;
	@ManyToOne
	@JoinColumn(name ="EMPLOYEE_ID")
	private Employee employeeId;

	
	
	
	public TrialTeam() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getTrialTeamId() {
		return trialTeamId;
	}




	public void setTrialTeamId(int trialTeamId) {
		this.trialTeamId = trialTeamId;
	}




	public int getTrialId() {
		return trialId;
	}




	public void setTrialId(int trialId) {
		this.trialId = trialId;
	}




	public Employee getEmployeeId() {
		return employeeId;
	}




	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}




	


	



}
