package com.example.fiscalia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="notes")
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="NOTE_ID")
	private int noteId;
	@OneToOne
	@JoinColumn(name ="TRIAL_ID")
	private Trial trialId;
	@Column(name ="TITLE")
	private String title;
	@Column(name ="DESCRIPTION")
	private String description;
	@OneToOne
	@JoinColumn(name ="SCHEDULE_ID")
	private Schedule scheduleId;
	@Column(name ="STATUS")
	private String status;


	
	
	
	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}





	public int getNoteId() {
		return noteId;
	}





	public void setNoteId(int noteId) {
		this.noteId = noteId;
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










	public Schedule getScheduleId() {
		return scheduleId;
	}





	public void setScheduleId(Schedule scheduleId) {
		this.scheduleId = scheduleId;
	}





	public String getStatus() {
		return status;
	}





	public void setStatus(String status) {
		this.status = status;
	}



}
