package com.library.app;

import com.library.books.Library;
import com.library.staff.Librarian;

public class LibraryApp {
	public static void main(String[] args) {
		// Create Library object
		Library library = new Library();
		library.setLibraryName("JNTUH");
		library.setTotal(5000);
		// Create Librarian object
		Librarian librarian = new Librarian();
		librarian.getLibrarianName("Karthik");
		librarian.setYearsOfExperience(5);
		// Display details
		library.showLibraryDetails();
		System.out.println();
		librarian.showLibraryDetails();
		}
		}


