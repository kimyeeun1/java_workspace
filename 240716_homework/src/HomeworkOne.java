import java.util.Scanner;

public class HomeworkOne {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		while (true) {
			System.out.println("숫자를 입력하세요.");
			int num1 = keyboard.nextInt();
			keyboard.nextLine();

			System.out.println("연산자를 입력하세요.");
			String op = keyboard.nextLine();

			System.out.println("숫자를 입력하세요.");
			int num2 = keyboard.nextInt();
			keyboard.nextLine();

			int result = getResult(num1, num2, op);

			System.out.println("연산의 결과: " + result);
			System.out.println("연산을 계속합니다.");
			System.out.println("연산을 계속하고 싶다면 엔터키를 누르세요");
			System.out.println("종료하고 싶다면 exit를 입력하세요.");

			if (result == 100000) {
				System.out.println("잘못된 입력입니다. 프로그램을 종료합니다.");
			}

			// 값을 입력받음
			String exitLoop = keyboard.nextLine();

			if (exitLoop.equals("exit")) {
				System.out.println("연산을 종료합니다...");
				break; // 반복을 종료함.
			}

		}

	}

	public static int getResult(int numberOne, int numberTwo, String operator) {

		if (operator.equals("+")) {

			return numberOne + numberTwo;

		}

		else if (operator.equals("-")) {

			return numberOne - numberTwo;

		}

		else if (operator.equals("*")) {

			return numberOne * numberTwo;
		}

		else if (operator.equals("/")) {

			return numberOne / numberTwo;
		}

		else {
			System.out.println("다시 입력하세요");
			return 100000;
		}

	}
}
