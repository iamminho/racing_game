import java.util.ArrayList;

import controller.CheckInput;
import controller.Input;
import model.Car;
import model.Cars;
import model.Num;

public class Main {
	public static void main(String[] args) {
		Input input = new Input();
		Cars cars = new Cars();
		Num num = new Num();


		// input.inputName();
		// ArrayList<Car> carArr = cars.getCars();
		//
		// for (int i = 0; i < carArr.size(); i++) {
		// 	Car tmp = carArr.get(i);
		// 	System.out.println(tmp.getName());
		// }

		input.inputCnt();
		System.out.println("시도할 횟수: " + num.getNum());

	}
}
