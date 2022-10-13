import java.util.ArrayList;
import java.util.HashMap;

import controller.CheckInput;
import controller.Input;
import controller.Score;
import model.Car;
import model.Cars;
import model.Num;
import model.Scores;

public class Main {
	public static void main(String[] args) {
		Input input = new Input();
		Cars cars = new Cars();
		Num num = new Num();
		Score sc = new Score();
		Scores scs = new Scores();


		input.inputName();
		// ArrayList<Car> carArr = cars.getCars();
		//
		// for (int i = 0; i < carArr.size(); i++) {
		// 	Car tmp = carArr.get(i);
		// 	System.out.println(tmp.getName());
		// }

		input.inputCnt();
		sc.inputScore();
		// HashMap<String, Integer> scores = scs.getScores();
		// System.out.println(scores);

		// System.out.println("시도할 횟수: " + num.getNum());

	}
}
