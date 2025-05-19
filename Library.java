package com.library.books;

public class Library {
	private String libraryName;
	private int totalBooks;
	public void setLibraryName(String name) {
		this.libraryName = name;
		}
		public void setTotal(int total) {
		this.totalBooks = total;
		}
		
		// Getter methods
		public String getLibraryName() {
		return libraryName;
		}
		public int getTotal() {
		return totalBooks;
		}
		

		// Method to display Library details
		public void showLibraryDetails() {
		System.out.println("Library Name: " + libraryName);
		System.out.println("Library Total Books: " + totalBooks);
	

		}

}
