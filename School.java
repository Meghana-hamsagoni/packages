package com.school.management;

public class School {
	
	private String name;
	private String location;
	public void setName(String name) {
		this.name = name;
		}
		public void setLocation(String location) {
		this.location = location;
		}
		// Getter methods
		public String getName() {
		return name;
		}
		public String getLocation() {
		return location;
		}
		// Method to display school details
		public void showSchoolInfo() {
		System.out.println("School Name: " + name);
		System.out.println("School Location: " + location);
		}
		}
		


