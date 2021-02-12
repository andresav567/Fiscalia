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
@Table(name="activities")
public class Activity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="ACTIVITY_ID")	
	private int activityId;
	@ManyToOne
	@JoinColumn(name ="STAGE_ID")
	private Stage stage;
	@Column(name ="ACTIVITY_NAME")
	private String activityName;	
	@Column(name ="ACTIVITY_CODE")
	private String activityCode;
	@Column(name ="EXPIRY")
	private int expiry;
	
	@OneToMany(mappedBy = "activityId")
	private Set<Schedule> schedule = new HashSet<Schedule>();
	
	@OneToMany(mappedBy = "activityId")
	private Set<TrialStage> trialStages = new HashSet<TrialStage>();
	public Activity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getActivityId() {
		return activityId;
	}
	public void setActivityId(int activityId) {
		this.activityId = activityId;
	}
	public Stage getStage() {
		return stage;
	}
	public void setStage(Stage stage) {
		this.stage = stage;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public String getActivityCode() {
		return activityCode;
	}
	public void setActivityCode(String activityCode) {
		this.activityCode = activityCode;
	}
	public int getExpiry() {
		return expiry;
	}
	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}
	public Set<Schedule> getSchedule() {
		return schedule;
	}
	public void setSchedule(Set<Schedule> schedule) {
		this.schedule = schedule;
	}
	public Set<TrialStage> getTrialStages() {
		return trialStages;
	}
	public void setTrialStages(Set<TrialStage> trialStages) {
		this.trialStages = trialStages;
	}




}
