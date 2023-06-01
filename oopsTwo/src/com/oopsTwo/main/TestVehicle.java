package com.oopsTwo.main;

import com.oopsTwo.entity.Vehicle;

class Car extends Vehicle {
	public String brand;
	public String model;
	
	public Car(String fuelType, String brand, String model) {
		super(fuelType);
		this.brand = brand;
		this.model = model;
	}
	public void accelerate(int val) {
		this.speed = val;
	}
}
class SportsCar extends Car{
	public int turbo;
	
	public SportsCar(String fuelType, String brand, String model) {
		super(fuelType, brand, model);
		this.turbo = 0;
	}
	public void turboBoost(int val) {
		this.turbo = val;
	}
}


public class TestVehicle {

	public static void main(String[] args) {
		Car myCar = new Car("Petrol","WagonR","Maruti");
		myCar.startEngine();
		myCar.accelerate(20);
		System.out.println("Model: "+myCar.brand+" Brand: "+myCar.model+" Fuel: "+
		myCar.fuelType+" Speed: "+myCar.speed+" Engine Status: "+myCar.engineStatus);
		
		SportsCar mySportsCar = new SportsCar("Petrol", "Mustang", "Posche");
		mySportsCar.startEngine();
		mySportsCar.accelerate(50);
		mySportsCar.turboBoost(100);
		System.out.println("Model: "+mySportsCar.brand+" Brand: "+mySportsCar.model+" Fuel: "+
		mySportsCar.fuelType+" Speed: "+mySportsCar.speed+" Engine Status: "+mySportsCar.engineStatus
		+" Turbo boost: "+mySportsCar.turbo);
	}

}
