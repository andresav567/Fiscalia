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
@Table(name="areas")
public class Area {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name ="AREA_ID")
	private int areaId;
	@Column(name ="AREA_NAME")
	private String areaName;	
	@Column(name ="ADDRESS")
	private String address;
	@ManyToOne
	@JoinColumn(name ="PARENT_AREA_ID")
	private Area parentAreaId;
	@Column(name ="STATUS")
	private String status;

	@OneToMany(mappedBy = "parentAreaId")
	private Set<Area> area = new HashSet<Area>();
	
	
	
	public Area() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getAreaId() {
		return areaId;
	}



	public void setAreaId(int areaId) {
		this.areaId = areaId;
	}



	public String getAreaName() {
		return areaName;
	}



	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}







	public Area getParentAreaId() {
		return parentAreaId;
	}



	public void setParentAreaId(Area parentAreaId) {
		this.parentAreaId = parentAreaId;
	}



	public Set<Area> getArea() {
		return area;
	}



	public void setArea(Set<Area> area) {
		this.area = area;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}






}
