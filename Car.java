package com.vehicles;

public class Car {
	private String model;
	private String brand;
	private double price;
	public void setModel(String model) {
		this.model = model;
		}
		public void setBrand(String brand) {
		this.brand = brand;
		}
		public void setPrice(double price) {
			this.price = price;
			}
			
		// Getter methods
		public String getModel() {
		return model;
		}
		public String getId() {
		return brand;
		}
		public double getPrice() {
		return price;
			}

		// Method to display school details
		public void showCarDetails() {
		System.out.println("Car Name: " + model);
		System.out.println("Car Brand: " + brand);
		System.out.println("Car price: " + price);

		}
		}


