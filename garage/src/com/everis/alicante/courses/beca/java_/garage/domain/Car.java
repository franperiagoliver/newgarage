package com.everis.alicante.courses.beca.java_.garage.domain;

public class Car {
	String plate;
	String color;
	String model;
	int numWheels;
	
	public Car (String plate, String color, String model){
		this.numWheels = 4;
		this.plate = plate;
		this.color = color;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [plate=" + plate + ", color=" + color + ", model=" + model + ", numWheels=" + numWheels + "]";
	}
	
	
}
