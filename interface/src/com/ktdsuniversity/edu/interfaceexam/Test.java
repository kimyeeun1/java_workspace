package com.ktdsuniversity.edu.interfaceexam;

public class Test {

	public static void main(String[] args) {

		Calculator ssCalc = new SamsungCalc();

		Calculator lgCalc = new LgCalc();

		Calculator appleCalc = new AppleCalc();

		int addResult = ssCalc.add(10, 20);
		int subResult = ssCalc.sub(10, 20);
		double divResult = ssCalc.div(10, 20);
		int mulResult = ssCalc.mul(10, 20);

		System.out.println("SumsungCalc: " + addResult);

	}

}
