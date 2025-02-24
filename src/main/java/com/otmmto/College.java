package com.otmmto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class College {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String collegeName;
	
	private String collegeCity;
	
	private String collegeState;
	
	private Integer collegePincode;
	
	@ManyToOne
	private University university;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public String getCollegeCity() {
		return collegeCity;
	}

	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}

	public String getCollegeState() {
		return collegeState;
	}

	public void setCollegeState(String collegeState) {
		this.collegeState = collegeState;
	}

	public Integer getCollegePincode() {
		return collegePincode;
	}

	public void setCollegePincode(Integer collegePincode) {
		this.collegePincode = collegePincode;
	}

	public University getUniversity() {
		return university;
	}

	public void setUniversity(University university) {
		this.university = university;
	}

	
	

}