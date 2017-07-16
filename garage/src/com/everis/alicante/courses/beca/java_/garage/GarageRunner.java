package com.everis.alicante.courses.beca.java_.garage;

import java.util.Scanner;

import com.everis.alicante.courses.beca.java_.garage.domain.Bike;
import com.everis.alicante.courses.beca.java_.garage.domain.Car;
import com.everis.alicante.courses.beca.java_.garage.domain.Motorbike;
import com.everis.alicante.courses.beca.java_.garage.runner.BikeManager;
import com.everis.alicante.courses.beca.java_.garage.runner.CarManager;
import com.everis.alicante.courses.beca.java_.garage.runner.MotorbikeManager;
import com.everis.alicante.courses.becajava.garage.ui.GarageMenu;

public class GarageRunner {
	static Scanner in = new Scanner(System.in);
	static CarManager carManager = new CarManager();
	static MotorbikeManager motorbikeManager = new MotorbikeManager();
	static BikeManager bikeManager = new BikeManager();
	
	public static void main(String[] args) {
		String option = null;
		do {
			option = GarageMenu.getInstance().play();
			
			switch (option) {
			case "1.1":
				listVehicle(option);
				break;
			case "1.2":
				newVehicle(option);
				break;
			case "1.3":
				deleteVehicle(option);
				break;
			case "2.1":
				listVehicle(option);
				break;
			case "2.2":
				newVehicle(option);
				break;
			case "2.3":
				deleteVehicle(option);
				break;
			case "3.1":
				listVehicle(option);
				break;
			case "3.2":
				newVehicle(option);
				break;
			case "3.3":
				deleteVehicle(option);
				break;

			default:
				break;
			}
		} while (!option.equals("0"));
		
	}
	
	public static void newVehicle(String option) {
		if(option.startsWith("1")) {
			System.out.println("Type your plate");
			String plate = in.nextLine();
			System.out.println("Type your color");
			String color = in.nextLine();
			System.out.println("Type your model");
			String model = in.nextLine();
			Car car = new Car(plate, color, model);
			carManager.save(car);
		}else if(option.startsWith("2")) {
			System.out.println("Type your plate");
			String plate = in.nextLine();
			System.out.println("Type your color");
			String color = in.nextLine();
			System.out.println("Type your model");
			String model = in.nextLine();
			Motorbike motorbike = new Motorbike(plate, color, model);
			motorbikeManager.save(motorbike);
		}else {
			System.out.println("Type your color");
			String color = in.nextLine();
			System.out.println("Type your model");
			String model = in.nextLine();
			Bike bike = new Bike(color, model);
			bikeManager.save(bike);
		}
	}
	
	public static void listVehicle(String option) {
		if(option.startsWith("1")) {
			System.out.println(carManager.list());
		}else if(option.startsWith("2")) {
			System.out.println(motorbikeManager.list());
		}else {
			System.out.println(bikeManager.list());
		}
	}
	
	public static void deleteVehicle(String option) {
		
		if(option.startsWith("1")) {
			System.out.println("Which car you want to delete?");
			for (int i = 0; i < carManager.list().size(); i++) {
				System.out.println("Press " + i + " to delete " + carManager.get(i));
			}
			int optionDelete = in.nextInt();
			Car carToDelete = carManager.get(optionDelete);
			carManager.delete(carToDelete);
			System.out.println(carToDelete + " DELETED");
			
		}else if(option.startsWith("2")) {
			System.out.println("Which motorbike you want to delete?");
			for (int i = 0; i < motorbikeManager.list().size(); i++) {
				System.out.println("Press " + i + " to delete " + motorbikeManager.get(i));
			}
			int optionDelete = in.nextInt();
			Motorbike motorbikeToDelete = motorbikeManager.get(optionDelete);
			motorbikeManager.delete(motorbikeToDelete);
			System.out.println(motorbikeToDelete + " DELETED");
			
		}else {
			System.out.println("Which bike you want to delete?");
			for (int i = 0; i < bikeManager.list().size(); i++) {
				System.out.println("Press " + i + " to delete " + bikeManager.get(i));
			}
			int optionDelete = in.nextInt();
			Bike bikeToDelete = bikeManager.get(optionDelete);
			bikeManager.delete(bikeToDelete);
			System.out.println(bikeToDelete + " DELETED");
		}
	}

}
