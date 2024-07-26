package com.ktdsuniversity.edu.interfaceexam;

public class LgCalc implements Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub

		if (a > b) {
			return a - b;
		}
		return b - a;
	}

	@Override
	public double div(int a, int b) {
		// TODO Auto-generated method stub

		if (a <= 0 || b <= 0) {
			return 0;
		}
		return (double) a / b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		if (a <= 0 || b <= 0) {
			return 0;
		}
		return a * b;
	}

}
