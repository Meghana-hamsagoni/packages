package com.school.staff;

public class Principal {
	private String principalName;
	private int experienceYears;

	public void setPrincipalName(String principalName) {
	      this.principalName=principalName; 
	}  

	public void setExperienceYears(int experienceYears) {
	      this.experienceYears=experienceYears; 
	}



	public String getPrincipalName() {
	      return principalName; 
	}

	public int experienceYears() {
	      return experienceYears; 
	}


	public  void  showPrincipalInfo() {

	System.out.println("Principal Name :" + principalName + "\n Experience Years :" + experienceYears);
	}
	}



