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
@Table(name="stages")
public class Stage {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="STAGE_ID")
	private int stageId;
    @ManyToOne
	@JoinColumn(name ="PROCESS_TYPE_ID")
	private ProcessType processTypeId;
	@Column(name ="STAGE_CODE")
	private String stageCode;
	@Column(name ="STAGE_NAME")
	private String stageName;
	@Column(name ="EXPIRY")
	private int expiry;
	
	@OneToMany(mappedBy = "stage")
	private Set<Activity> activity = new HashSet<Activity>();
	 
	@OneToMany(mappedBy = "stageId")
	private Set<Schedule> schedule = new HashSet<Schedule>();
	
	@OneToMany(mappedBy = "stageId")
	private Set<TrialStage> trialStage = new HashSet<TrialStage>();
	
	public Stage() {
		super();
		// TODO Auto-generated constructor stub
	}




	public int getStageId() {
		return stageId;
	}




	public void setStageId(int stageId) {
		this.stageId = stageId;
	}





	public ProcessType getProcessTypeId() {
		return processTypeId;
	}




	public void setProcessTypeId(ProcessType processTypeId) {
		this.processTypeId = processTypeId;
	}




	public Set<Activity> getActivity() {
		return activity;
	}




	public void setActivity(Set<Activity> activity) {
		this.activity = activity;
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




	public String getStageCode() {
		return stageCode;
	}




	public void setStageCode(String stageCode) {
		this.stageCode = stageCode;
	}




	public String getStageName() {
		return stageName;
	}




	public void setStageName(String stageName) {
		this.stageName = stageName;
	}




	public int getExpiry() {
		return expiry;
	}




	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}




}
