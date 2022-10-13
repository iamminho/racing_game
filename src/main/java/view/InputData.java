package view;

import java.util.Scanner;

public class InputData {
	public static String inputCarName() {
		Scanner sc = new Scanner(System.in);
		String carName;

		System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
		carName = sc.nextLine();

		return carName;
	}

	public static String inputCnt() {
		Scanner sc = new Scanner(System.in);
		String count;

		System.out.println("시도할 회수는 몇회인가요?");
		count = sc.nextLine();

		return count;
	}


}
