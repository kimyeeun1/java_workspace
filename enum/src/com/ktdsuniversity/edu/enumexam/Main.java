package com.ktdsuniversity.edu.enumexam;

public class Main {

	public static void main(String[] args) {

		SimpleCalculator simpleCalculator = new SimpleCalculator();

		int result = simpleCalculator.getResult(Type.ADD, 10, 20);
		System.out.println(result);
		result = simpleCalculator.getResult(Type.SUB, 10, 20);
		System.out.println(result);
		result = simpleCalculator.getResult(Type.MUL, 10, 20);
		System.out.println(result);
		result = simpleCalculator.getResult(Type.DIV, 10, 20);
		System.out.println(result);
	}
}
