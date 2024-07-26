
public class HomeworkTwo {

	public static int number(int numberOne, int numberTwo) {
		int count = 0;

		for (int i = numberOne; i < numberTwo + 1; i++) {
			if (prime(i)) {
				count++;
			}
		}
		return count;
	}

	public static boolean prime(int num) {
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int count = number(1, 10000);
		System.out.println("소수의 갯수: " + count);
	}

}
