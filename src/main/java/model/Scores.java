package model;

import java.util.HashMap;

public class Scores {
	public static HashMap<String, Integer> scores = new HashMap<>();

	public static HashMap<String, Integer> getScores() {
		return scores;
	}

	public static void goFoward(String name) {
		scores.put(name, scores.getOrDefault(name, 0) + 1);
	}
}
