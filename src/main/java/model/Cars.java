package model;

import java.util.ArrayList;

import controller.CheckInput;

public class Cars {
	static ArrayList<Car> cars = new ArrayList<>();

	public static ArrayList<Car> getCars() {
		return cars;
	}

	public static void inputCars(String carName) {
		CheckInput check = new CheckInput();
		String[] names = check.splitCarName(carName);

		for (String name : names) {
			Car car = new Car(name);
			cars.add(car);
		}
	}
}
