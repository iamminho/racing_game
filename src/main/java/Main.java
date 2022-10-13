import java.util.ArrayList;

import controller.CheckInput;
import controller.Input;
import model.Car;
import model.Cars;

public class Main {
	public static void main(String[] args) {
		Input input = new Input();
		Cars cars = new Cars();

		input.inputName();
		ArrayList<Car> carArr = cars.getCars();

		for (int i = 0; i < carArr.size(); i++) {
			Car tmp = carArr.get(i);
			System.out.println(tmp.getName());
		}
	}
}
