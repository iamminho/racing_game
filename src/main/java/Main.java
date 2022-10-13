import java.util.ArrayList;
import java.util.HashMap;

import controller.CheckInput;
import controller.Input;
import controller.Result;
import controller.Score;
import model.Car;
import model.Cars;
import model.Num;
import model.Scores;

public class Main {
	public static void main(String[] args) {
		Input input = new Input();
		Score sc = new Score();
		Result res = new Result();

		input.inputName();
		input.inputCnt();
		sc.inputScore();
		res.finalWinner();
	}
}
