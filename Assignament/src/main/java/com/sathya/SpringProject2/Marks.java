package com.sathya.SpringProject2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Marks {
	@Value("89.0")
	private double science;
	@Value("69.0")
	private double social;
	@Value("100")
	private double maths;
	public double getScience() {
		return science;
	}
	public void setScience(double science) {
		this.science = science;
	}
	public double getSocial() {
		return social;
	}
	public void setSocial(double social) {
		this.social = social;
	}
	public double getMaths() {
		return maths;
	}
	public void setMaths(double maths) {
		this.maths = maths;
	}
	
	public void TotalMarks() {
		double tM=science+social+maths;
		System.out.println("The total marks : "+tM);
		double avg= tM/3;
		System.out.println("The Average marks : "+avg);
	}

}
