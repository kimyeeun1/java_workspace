package hello_java_world;

import java.util.Random;
import java.util.Scanner;

public class UpDownGame {

	public static void main(String[]args)	{
		
		//Psuedo Code (의사코드)
		//코드의 논리식을 문자로 나열
		
		//1. 랜덤한 숫자 하나를 생성.


		//0~99 중 하나의 숫자를 랜덤해서 선택
		Random random = new Random();
		int number = random.nextInt(100);
		
		//2. 사용자가 숫자를 입력.
		Scanner keyboard = new Scanner(System.in);
		int a = keyboard.nextInt();
		
		String b = "";
		
		//3. 랜덤한 숫자와 사용자가 입력한 숫자가 같은지 비교.
		if (number == a) {
			b = "정답입니다!";
		}
			
		
		//4. 랜덤한 숫자가 사용자가 입력한 숫자보다 작은지 비교.
		else if (number < a) {
			b = "Down!";
		}
			
		
		//5. 랜덤한 숫자가 사용자가 입력한 숫자보다 큰 지 비교.
		else  {
			b = "Up!";
		}
		
		System.out.println(b);
		System.out.println(number);	
	}
}