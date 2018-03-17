package model;

public class Student {
	
	public Student() {
		this.name="";
		this.email = "";
		this.address = "";		
	}
	
	public Student(String name,String email,String address) {
		this.name = name;
		this.email = email;
		this.address = address;
	}
	private String name,email,address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String adress) {
		this.address = adress;
	}
	
	

}
