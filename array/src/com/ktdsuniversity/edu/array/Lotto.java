package com.ktdsuniversity.edu.array;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		int[] numberArray = new int[6];

		Random random = new Random();

		for (int i = 0; i < numberArray.length; i++) {
			numberArray[i] = random.nextInt(45) + 1;

			for (int j = 0; j < i; j++) {
				// System.out.println(i + ": " + numberArray[i] + " / " + j + ": " +
				// numberArray[j]);
				if (numberArray[i] == numberArray[j]) {
					System.out.println("중복된 숫자입니다." + numberArray[j]);
				}
			}
		}

		System.out.println("로또 번호 추출 결과");
		for (int i = 0; i < numberArray.length; i++) {
			System.out.println(numberArray[i]);
		}

	}

}
