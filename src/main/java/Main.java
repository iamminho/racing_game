import controller.Input;
import controller.Result;
import controller.Score;

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
