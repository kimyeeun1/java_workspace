package homework;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		while (true) {
			System.out.println("첫번째 숫자를 입력하세요.");
			double numberOne = keyboard.nextDouble();
			
			System.out.println("연산자를 입력하세요.");
			String operator = keyboard.next();
			if (operator.equals("exit")) {
				break;
			}
			
			System.out.println("두번째 숫자를 입력하세요.");
			double numberTwo = keyboard.nextDouble();

			if (operator.equals("+")) {
				System.out.println("= " + (numberOne + numberTwo));
			} else if (operator.equals("-")) {
				System.out.println("= " + (numberOne - numberTwo));
			} else if (operator.equals("*")) {
				System.out.println("= " + (numberOne * numberTwo));
			} else if (operator.equals("/")) {
				System.out.println("= " + (numberOne / numberTwo));
			}
			else {
				try {
					if(!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/") && !operator.equals("exit"));
				}
			}

		}

	}

}
