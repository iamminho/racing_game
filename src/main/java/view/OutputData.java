package view;

import java.util.ArrayList;
import java.util.HashMap;

import model.Car;
import model.Cars;

public class OutputData {
	static Cars cars = new Cars();
	public static void printResult(HashMap<String, Integer> map) {
		ArrayList<Car> carArr = cars.getCars();

		for(int i = 0; i < carArr.size(); i++) {
			Car car = carArr.get(i);
			int distance = getDistance(map, car);

			printKey(car.getName());
			printValue(distance);
			System.out.println("");
		}

		System.out.println("");
	}

	static int getDistance (HashMap<String, Integer> map, Car car) {
		int distance = 0;

		if(hasKey(map, car.getName())) {
			distance = map.get(car.getName());
		}

		return distance;
	}

	static boolean hasKey(HashMap<String, Integer> map, String carName) {
		if(map.containsKey(carName)) {
			return true;
		}

		return false;
	}

	static void printKey(String car) {
		System.out.print(car + " : ");
	}

	static void printValue(int value) {
		for(int i = 0; i < value; i++) {
			System.out.print("-");
		}
	}
}
