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
@Table(name="files")
public class File {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="FILE_ID")
	private int fileId;
	@ManyToOne
	@JoinColumn(name ="TRIAL_ID")
	private Trial trialId;
	@Column(name ="TITLE")
	private String title;
	@Column(name ="DESCRIPTION")
	private String description;
	@Column(name ="URL")
	private String url;
	@Column(name ="STATUS")
	private String status;
	
	
	
	public File() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getFileId() {
		return fileId;
	}



	public void setFileId(int fileId) {
		this.fileId = fileId;
	}




	public Trial getTrialId() {
		return trialId;
	}



	public void setTrialId(Trial trialId) {
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



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



}
