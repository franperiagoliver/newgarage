package com.everis.alicante.courses.beca.java_.garage.domain;

public class Bike {
	String color;
	String model;
	int numWheels;
	
	public Bike (String color, String model){
		this.numWheels = 2;
		this.color = color;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Bike [color=" + color + ", model=" + model + ", numWheels=" + numWheels + "]";
	}
	
	
}
