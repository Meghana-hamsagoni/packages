package com.vehicles.parts;

public class Engine {
		private String engineType;
		private int horsePower;

		

		public void setengineType(String engine) {
		      this.engineType=engine; 
		}
	
		public int sethorsePower(int horsepower) {
		      return horsePower; 
		}


		public  void  showEngineDetails() {

		System.out.println("Engine Name :" + engineType + "\nHorse Power  :" + horsePower);
		}
		}


