package model;

public class Num {
	public static int num;

	public static int getNum() {
		return num;
	}

	public static void inputNum(String cnt) {
		num = Integer.parseInt(cnt);
	}
}
