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
@Table(name="courts")
public class Court {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="COURT_ID")
	private int courtId;
	@ManyToOne
	@JoinColumn(name ="CITY_ID")
	private City cityId;	
	@Column(name ="COURT_NAME")
	private String courtName;
	@Column(name ="NOMINATION")
	private String nomination;
	@Column(name ="ADDRESS")
	private String address;
	@Column(name ="STATUS")
	private String status;

	@OneToMany(mappedBy = "courtId")
	private Set<Schedule> schedule = new HashSet<Schedule>();
	
	@OneToMany(mappedBy = "courtId")
	private Set<TrialStage> trialStage = new HashSet<TrialStage>();
	
	@OneToMany(mappedBy = "courtId")
	private Set<Trial> rial = new HashSet<Trial>();
	public Court() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getCourtId() {
		return courtId;
	}



	public void setCourtId(int courtId) {
		this.courtId = courtId;
	}






	public City getCityId() {
		return cityId;
	}



	public void setCityId(City cityId) {
		this.cityId = cityId;
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



	public String getCourtName() {
		return courtName;
	}



	public void setCourtName(String courtName) {
		this.courtName = courtName;
	}



	public String getNomination() {
		return nomination;
	}



	public void setNomination(String nomination) {
		this.nomination = nomination;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



}
