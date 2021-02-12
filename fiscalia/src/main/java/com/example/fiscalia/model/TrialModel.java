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
@Table(name="trial_models")
public class TrialModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="TRIAL_MODEL_ID")
	private int trialModelId;
	@Column(name ="TITLE")
	private String title;
	@Column(name ="DESCRIPTION")
	private String description;
	@ManyToOne
	@JoinColumn(name ="PROCESS_TYPE_ID")
	private ProcessType processTypeId;
	@Column(name ="ANALYSIS")
	private String analysis;
	@Column(name ="ASUMPTIONS")
	private String asumptions;
	@Column(name ="STATUS")
	private String status;
	
	public TrialModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getTrialModelId() {
		return trialModelId;
	}

	public void setTrialModelId(int trialModelId) {
		this.trialModelId = trialModelId;
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


	public ProcessType getProcessTypeId() {
		return processTypeId;
	}

	public void setProcessTypeId(ProcessType processTypeId) {
		this.processTypeId = processTypeId;
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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}


	


}
