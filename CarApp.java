package com.vehicles.app;

import com.vehicles.parts.Engine;
import com.vehicles.Car;

public class CarApp {
	public static void main(String[] args) {
		// Create car object
		Car vehicle = new Car();
		vehicle.setModel("Maruti");
		vehicle.setBrand("Suzuki");
		vehicle.setPrice(500000);
		// Create Engine object
		Engine principal = new Engine();
		principal.setengineType("Engine");
		principal.sethorsePower(50);
		// Display details
		vehicle.showCarDetails();
		System.out.println();
		principal.showEngineDetails();
		}
		}


