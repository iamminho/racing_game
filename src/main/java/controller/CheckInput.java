package controller;

import java.util.regex.Pattern;

public class CheckInput {
	public static boolean checkCarName (String carName) {
		String [] carNames = splitCarName(carName);

		for (String name : carNames) {
			if (!checkNameLen(name) || !checkNameSpace(name)) return false;
		}

		return true;
	}

	public static String[] splitCarName (String carName) {
		String[] result = carName.split(",");

		return result;
	}

	public static boolean checkNameLen (String name) {
		if (name.length() > 5) return false;

		return true;
	}

	public static boolean checkNameSpace (String name) {
		String pattern = "^\\S*$";
		boolean result;

		result = Pattern.matches(pattern, name);

		return result;
	}

	public static boolean checkCnt (String cnt) {
		String pattern = "^[0-9]*$";
		boolean result;

		if (cnt.charAt(0) == '0') return false;
		result = Pattern.matches(pattern, cnt);

		return result;
	}
}
