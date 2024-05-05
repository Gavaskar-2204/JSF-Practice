package com.demo.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class StudentTwo {
	//no-org constructor
		public StudentTwo() {
			//populate the country list
			countryList=new ArrayList<String>();
			countryList.add("France");
			countryList.add("Australia");
			countryList.add("United Kingdom");
			countryList.add("United States");
			countryList.add("India");
		}

		private String firstName;
		private String lastName;
		
		private String country="";
		
		List<String> countryList;
		
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
		public  String getCountry() {
			return country;
		}
		public  void setCountry(String country) {
			this.country = country;
		}
		public  List<String> getCountryList() {
			return countryList;
		}
//		public final void setCountryList(List<String> countryList) {
//			this.countryList = countryList;
//		}
		
		
		
}
