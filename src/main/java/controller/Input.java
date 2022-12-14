package controller;

import model.Cars;
import model.Num;
import view.InputData;

public class Input {
	static InputData input = new InputData();
	static CheckInput check = new CheckInput();
	static Cars cars = new Cars();
	static Num number = new Num();


	public static void inputName() {
		String carName = input.inputCarName();
		boolean flag = true;

		try {
			exceptName(carName);
		} catch(IllegalArgumentException e) {
			System.out.println("[Error] 각각의 자동차 이름은 5글자 이하이거나 공백이 없어야 한다.");
			System.out.println(e);
			flag = false;
			inputName();
		}

		if(flag) {
			cars.inputCars(carName);
		}
	}

	static void exceptName(String carName) throws IllegalArgumentException {
		if(!check.checkCarName(carName)) {
			throw new IllegalArgumentException();
		}
	}

	public static void inputCnt() {
		String cnt = input.inputCnt();
		boolean flag = true;

		try {
			exceptCnt(cnt);
		} catch(IllegalArgumentException e) {
			System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
			System.out.println(e);
			flag = false;
			inputCnt();
		}
		if(flag) {
			number.inputNum(cnt);
		}
	}

	static void exceptCnt (String cnt) throws IllegalArgumentException {
		if(!check.checkCnt(cnt)) {
			throw new IllegalArgumentException();
		}
	}
}
