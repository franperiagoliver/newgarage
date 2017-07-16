package com.everis.alicante.courses.beca.java_.garage.runner;

import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.java_.garage.domain.Car;


public class CarManager {
	List<Car> elements = new ArrayList<>();
	
	public List<Car> list(){
		return elements;
	}
	
	public Car save(Car car){
		elements.add(car);
		return car;
	}
	
	public void delete(Car car) {
		elements.remove(car);
	}
	
	public Car get(int i) {
		return elements.get(i);
	}
	
}