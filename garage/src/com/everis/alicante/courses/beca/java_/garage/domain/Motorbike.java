package com.everis.alicante.courses.beca.java_.garage.domain;

public class Motorbike {
	String plate;
	String color;
	String model;
	int numWheels;
	
	public Motorbike (String plate, String color, String model){
		this.numWheels = 2;
		this.plate = plate;
		this.color = color;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Motorbike [plate=" + plate + ", color=" + color + ", model=" + model + ", numWheels=" + numWheels + "]";
	}
	
	
}
