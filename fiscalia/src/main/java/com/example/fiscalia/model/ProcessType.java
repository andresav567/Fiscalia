package com.example.fiscalia.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="process_types")
public class ProcessType {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="PROCESS_TYPE_ID")
	private int processTypeId;
	@Column(name ="PROCESS_TYPE_CODE")
	private String processTypeCode;
	@Column(name ="PROCESS_TYPE_NAME")
	private String processTypeName;
	
	@OneToMany(mappedBy = "processTypeId")
	private Set<Stage> stage = new HashSet<Stage>();
	 
	@OneToMany(mappedBy = "processTypeId")
	private Set<TrialModel> trialmodel = new HashSet<TrialModel>();
	
	@OneToMany(mappedBy = "processTypeId")
	private Set<Trial> trial = new HashSet<Trial>();
	
	public ProcessType() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getProcessTypeId() {
		return processTypeId;
	}



	public void setProcessTypeId(int processTypeId) {
		this.processTypeId = processTypeId;
	}



	public String getProcessTypeCode() {
		return processTypeCode;
	}



	public void setProcessTypeCode(String processTypeCode) {
		this.processTypeCode = processTypeCode;
	}



	public String getProcessTypeName() {
		return processTypeName;
	}



	public void setProcessTypeName(String processTypeName) {
		this.processTypeName = processTypeName;
	}



	public Set<Stage> getStage() {
		return stage;
	}



	public void setStage(Set<Stage> stage) {
		this.stage = stage;
	}



	public Set<TrialModel> getTrialmodel() {
		return trialmodel;
	}



	public void setTrialmodel(Set<TrialModel> trialmodel) {
		this.trialmodel = trialmodel;
	}







}
