package com.company.app;

import com.company.hr.Employee;
import com.company.admin.Department;

public class CompanyApp {
	public static void main(String[] args) {
		// Create Employee object
		Employee employee = new Employee();
		employee.setName("SMP");
		employee.setId(100);
		employee.setSalary(10000);
		
		// Create Department object
		Department department = new Department();
		department.setDeptName("computers");
		department.setDeptId(5);
		// Display details
		employee.showEmployeeDetails();
		System.out.println();
		department.showDepartmentDetails();
		}
		}


