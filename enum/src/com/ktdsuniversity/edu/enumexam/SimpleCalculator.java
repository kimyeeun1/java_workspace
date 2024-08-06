package com.ktdsuniversity.edu.enumexam;

public class SimpleCalculator {

	public int getResult(Type type, int numberOne, int numberTwo) {

		if (type == Type.ADD) {
			return numberOne + numberTwo;
		} else if (type == Type.SUB) {
			return numberOne - numberTwo;
		} else if (type == Type.MUL) {
			return numberOne * numberTwo;
		} else {
			return numberOne / numberTwo;
		}
	}
}
