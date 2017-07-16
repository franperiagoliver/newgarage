package com.everis.alicante.courses.beca.java_.garage.runner;

import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.java_.garage.domain.Bike;

public class BikeManager {
	List<Bike> elements = new ArrayList<>();
	
	public List<Bike> list(){
		return elements;
	}
	
	public Bike save(Bike bike){
		elements.add(bike);
		return bike;
	}
	
	public void delete(Bike bike) {
		elements.remove(bike);
	}
	
	public Bike get(int i) {
		return elements.get(i);
	}

}
