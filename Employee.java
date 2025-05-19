package com.company.hr;

public class Employee {
	
	private int id;
	private String name;
	private double salary;
	public void setName(String name) {
		this.name = name;
		}
		public void setId(int id) {
		this.id = id;
		}
		public void setSalary(double salary) {
			this.salary = salary;
			}
			
		// Getter methods
		public String getName() {
		return name;
		}
		public int getId() {
		return id;
		}
		public double getSalary() {
		return salary;
			}

		// Method to display school details
		public void showEmployeeDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee Id: " + id);
		System.out.println("Employee salary: " + salary);

		}
		}
		



