package com.emabeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Salary {

	@Column(name="emp_fixedsalary")
	private double fixedSalary;
	
	@Column(name="emp_currentsalary")
	private double currentSalary;
	
	@Column(name="emp_bonus")
	private double bonus;
	
	@Column(name="emp_increment")
	private double increment;

	@Column(name="emp_totalsalary")
	private double totalSalary;
	
	public double getFixedSalary() {
		return fixedSalary;
	}

	public void setFixedSalary(double fixedSalary) {
		this.fixedSalary = fixedSalary;
	}

	public double getCurrentSalary() {
		return currentSalary;
	}

	public void setCurrentSalary(double currentSalary) {
		this.currentSalary = currentSalary;
	}

	public double getTotalSalary() {
		return totalSalary;
	}

	public void setTotalSalary(double totalSalary) {
		this.totalSalary = totalSalary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public double getIncrement() {
		return increment;
	}

	public void setIncrement(double increment) {
		this.increment = increment;
	}
	
}