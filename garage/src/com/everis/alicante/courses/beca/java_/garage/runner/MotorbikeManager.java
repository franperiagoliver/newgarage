package com.everis.alicante.courses.beca.java_.garage.runner;

import java.util.ArrayList;
import java.util.List;

import com.everis.alicante.courses.beca.java_.garage.domain.Motorbike;

public class MotorbikeManager {
	List<Motorbike> elements = new ArrayList<>();
	
	public List<Motorbike> list(){
		return elements;
	}
	
	public Motorbike save(Motorbike motorbike){
		elements.add(motorbike);
		return motorbike;
	}
	
	public void delete(Motorbike motorbike) {
		elements.remove(motorbike);
	}
	
	public Motorbike get(int i) {
		return elements.get(i);
	}
	
}
