package com.oto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class TableTwo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String wifeName;
	
	private Integer wifeAge;

	@OneToOne
	@JoinColumn(name="husband_id")
	private TableOne husbandName;

	public TableOne getHusbandName() {
		return husbandName;
	}

	public void setHusbandName(TableOne husbandName) {
		this.husbandName = husbandName;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}

	public Integer getWifeAge() {
		return wifeAge;
	}

	public void setWifeAge(Integer wifeAge) {
		this.wifeAge = wifeAge;
	}
	
	
}
