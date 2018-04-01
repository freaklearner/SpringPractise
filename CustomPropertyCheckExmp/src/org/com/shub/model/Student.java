package org.com.shub.model;

import java.util.Date;
import java.util.List;

public class Student {
	
	private String username;
	private long usercont;
	private Date userdob;
	private List<String> skills;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public long getUsercont() {
		return usercont;
	}
	public void setUsercont(long usercont) {
		this.usercont = usercont;
	}
	public Date getUserdob() {
		return userdob;
	}
	public void setUserdob(Date userdob) {
		this.userdob = userdob;
	}
	public List<String> getSkills() {
		return skills;
	}
	public void setSkills(List<String> skills) {
		this.skills = skills;
	}
	
	

}
