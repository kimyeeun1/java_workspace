package com.ktdsuniversity.edu.exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExceptionTest {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		// 1. 사용자가 문자를 입력하면 숫자로 변경하는 코드 (정상 처리되는 케이스)
		String str = keyboard.nextLine();
		int number = 0;
		if (str.matches("^[0-9]+$")) { // 포멧 체크 하기 때문에 예외 발생하지 않음! ==> 안전한 코드
			number = Integer.parseInt(str); // 값에 따라 NumberFormatException이 발생
		}
		System.out.println(number);

		// 2. 숫자를 입력받는 코드에 문자를 쓰면? (비정상 케이스 확률이 더 높음)
		// if 체크 불가능 ==> try ~ catch

		/*
		 * try { 예외가 발생할 수 있는 코드를 작성 예외가 발생할 가능성이 0.1%라도 있을 경우, try 내부에 작성
		 * NumberFormatException이 바생할 가능성이 높다 } catch(try에서 발생하는 예외 클래스 작성(파라미터처럼) = >
		 * NumberFormatException exception) { 예외를 다루는 후처리 코드 }
		 */

		String numberString = null;
		try { // try 안의 내용이 많을수록 기능이 떨어짐

			System.out.println("숫자를 입력하세요");

			// InputMismatchException 발생
			numberString = keyboard.nextInt() + ""; // + :"" => 정수값을 String으로 변환하는 법 //숫자 형태가 아닌 문자들을 작성하면 예외 발생

			System.out.println("숫자를 입력하셨군요?");

		} catch (InputMismatchException exception) {
			System.out.println("예외가 발생했습니다.");
			System.out.println("아마도 숫자가 아닌 문자를 입력했나봅니다.");
		}
		System.out.println(numberString);
	}

}
