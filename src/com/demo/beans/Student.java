package com.demo.beans;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Student {

	//no-org constructor
	public Student() {
		super();
	}

	private String firstName;
	private String lastName;
	
	//define getters/setters methods 
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	

}
