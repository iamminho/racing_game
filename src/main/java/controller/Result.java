package controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import model.Cars;
import model.Scores;

public class Result {
	static Cars cars = new Cars();
	static Scores sc = new Scores();
	static HashMap<String, Integer> scores = sc.getScores();

	public static void finalWinner() {
		int maxValue = getMax();
		ArrayList<String> winners = getWinner(maxValue);
		printWinners(winners);
	}

	static int getMax() {
		int max = 0;

		for(Map.Entry<String, Integer> elem : scores.entrySet()) {
			if(max < elem.getValue()) {
				max = elem.getValue();
			}
		}

		return max;
	}

	static ArrayList<String> getWinner(int maxValue) {
		ArrayList<String> result = new ArrayList<>();

		for(Map.Entry<String, Integer> elem : scores.entrySet()) {
			if(elem.getValue() == maxValue) {
				result.add(elem.getKey());
			}
		}

		return result;
	}

	static void printWinners(ArrayList<String> winners) {
		System.out.print("최종 우승자 : ");

		for(int i = 0; i < winners.size(); i++) {
			System.out.print(winners.get(i));

			if(i != winners.size() -1) {
				System.out.print(", ");
			}
		}
	}
}
