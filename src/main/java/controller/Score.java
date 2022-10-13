package controller;

import java.util.ArrayList;
import java.util.Random;

import model.Car;
import model.Cars;
import model.Num;
import model.Scores;

public class Score {
	static Scores sc = new Scores();
	static Cars cars = new Cars();
	static ArrayList<Car> carArr = cars.getCars();

	public static void inputScore() {
		Num number = new Num();
		int n = number.getNum();

		for (int i=0; i < n; i++) {
			carMove();
		}
	}

	public static void carMove() {
		for (int i=0; i < carArr.size(); i++) {
			Car car = carArr.get(i);
			if (isCanMove()) {
				getScore(car);
			}
		}
		System.out.println(sc.getScores());
	}

	public static boolean isCanMove() {
		Random rd = new Random();
		int number = rd.nextInt(10);

		if (number >= 4) {
			return true;
		}

		return false;
	}

	public static void getScore(Car car) {
		String name = car.getName();
		sc.goFoward(name);
	}

}
