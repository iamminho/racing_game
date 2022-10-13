package controller;

import view.InputData;

public class Input {
	static InputData input = new InputData();
	static CheckInput check = new CheckInput();

	public static void inputName() {
		String carName = input.inputCarName();

		try {
			exceptName(carName);
		} catch (IllegalArgumentException e) {
			System.out.println("[Error] 자동차 이름은 5글자 이하여야 한다.");
			System.out.println(e);
			inputName();
		}
	}

	static void exceptName (String carName) throws IllegalArgumentException {
		if(!check.checkCarName(carName)) {
			throw new IllegalArgumentException();
		}
	}

	public static void inputCnt() {
		int result;
		String cnt = input.inputCnt();

		try {
			exceptCnt(cnt);
		} catch (IllegalArgumentException e) {
			System.out.println("[ERROR] 시도 횟수는 숫자여야 한다.");
			System.out.println(e);
			inputCnt();
		}

		result = Integer.parseInt(cnt);
	}

	static void exceptCnt (String cnt) throws IllegalArgumentException {
		if(!check.checkCnt(cnt)) {
			throw new IllegalArgumentException();
		}
	}
}
