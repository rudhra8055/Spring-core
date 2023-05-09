package com.sathya.SpringProject2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class School {
	@Value("101")
	private int sId;
	@Value("sathya")
	private String Sname;
	@Value("Ameerpet")
	private String Slocation;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getSlocation() {
		return Slocation;
	}
	public void setSlocation(String slocation) {
		Slocation = slocation;
	}

}
