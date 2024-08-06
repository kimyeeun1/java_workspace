package homework240729;

import java.util.Scanner;

public class CalculatorMain {

	public static double calculator(String operator, double numOne, double numTwo) {

		if (operator.equals("+")) {
			return numOne + numTwo;
		} else if (operator.equals("-")) {
			return numOne - numTwo;
		} else if (operator.equals("*")) {
			return numOne * numTwo;
		} else if (operator.equals("/")) {
			return numOne / numTwo;
		}
		return 0;
	}

	public static boolean operatorCheck(String operator) {
		// + - * / 4개 다 아닐경우(조건) 아래에 코드 실행한다 (예외를 던져준다)
		if (!operator.equals("+") && !operator.equals("-") && !operator.equals("*") && !operator.equals("/")
				&& !operator.equals("exit")) {
			throw new operatorException("+,-,*,/.exit 중에 입력해주세요.");
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("연산자를 입력해주세요");
			String operator = null;

			try {
				operator = scanner.next();
				boolean correct = operatorCheck(operator);
			} catch (operatorException e) {
				e.printStackTrace();
				main(args);
			}
			if (operator.equals("exit")) {
				break;
			}
			System.out.println("첫번째 숫자를 입력해주세요");
			double numOne = scanner.nextDouble();

			System.out.println("두번째 숫자를 입력해주세요");
			double numTwo = scanner.nextDouble();

			System.out.println(calculator(operator, numOne, numTwo));
		}
	}
}
