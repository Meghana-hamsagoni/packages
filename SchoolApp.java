package com.school.app;
import com.school.management.School;
import com.school.staff.Principal;


public class SchoolApp {
	public static void main(String[] args) {
	// Create School object
	School school = new School();
	school.setName("SMP");
	school.setLocation("Hydershakote");
	// Create Principal object
	Principal principal = new Principal();
	principal.setPrincipalName("Divya");
	principal.setExperienceYears(5);
	// Display details
	school.showSchoolInfo();
	System.out.println();
	principal.showPrincipalInfo();
	}
	}


