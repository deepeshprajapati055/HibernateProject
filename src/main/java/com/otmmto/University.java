package com.otmmto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class University {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String universityName;
	
	private String universityCity;
	
	private String universityState;
	
	private Integer universityPincode;
	
	@OneToMany(mappedBy="university")
	private List<College> college;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityCity() {
		return universityCity;
	}

	public void setUniversityCity(String universityCity) {
		this.universityCity = universityCity;
	}

	public String getUniversityState() {
		return universityState;
	}

	public void setUniversityState(String universityState) {
		this.universityState = universityState;
	}

	public Integer getUniversityPincode() {
		return universityPincode;
	}

	public void setUniversityPincode(Integer universityPincode) {
		this.universityPincode = universityPincode;
	}

	public List<College> getCollege() {
		return college;
	}

	public void setCollege(List<College> college) {
		this.college = college;
	}


}