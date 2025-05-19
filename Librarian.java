package com.library.staff;

public class Librarian {
	private String librarianName;
	private int yearsOfExperience;

	

	public void getLibrarianName(String name) {
	      this.librarianName=name; 
	}

	public int setYearsOfExperience(int yearsOfExperience) {
	      return yearsOfExperience; 
	}


	public  void  showLibraryDetails() {

	System.out.println("Librarian Name :" + librarianName + "\nYears Of Experience :" + yearsOfExperience);
	}
	}


