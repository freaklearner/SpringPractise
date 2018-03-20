package com.org.shub.model;

import java.util.ArrayList;
import java.util.Date;

public class Student {
	
	private String username;
	private String location;
	private long mobile;
	private Date dob;
	private ArrayList<String> skill;
	
	
	public ArrayList<String> getSkill() {
		return skill;
	}
	public void setSkill(ArrayList<String> skill) {
		this.skill = skill;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	

}
