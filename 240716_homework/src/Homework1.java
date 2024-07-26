
public class Homework1 {
	public static void getPrimeNumber() {
		int count = 0;
		for (int i = 2; i < 10001; i++) {
			boolean isPrimeNumber = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break;
				}
			}
			if (isPrimeNumber) {
				count++;
			}
		}
		System.out.println("소수의 개수: " + count);
	}

	public static void main(String[] args) {
		getPrimeNumber();

	}

}
