package hello_java_world;

public class VariableScope {
	public static void main(String[]args) {
		int number = 10;
		int other = 15;
		
		int bigNumber = 0;
		// number의 수와 other의 수 중 큰 숫자는 무엇인가?
		if (number > other)	{
			bigNumber = number;
		}
		else {
			bigNumber = other;
		}
		
		System.out.println(number + "와 " + other + "중 큰 숫자는 " + bigNumber + "입니다.");
		
	}
}
