package basic_grammer_loop;

import java.util.Scanner;

public class ForSyntax {
	
	public static void main(String[] args) {
		/*
		 * for (초기값; 반복조건; 증감식) {
		 * 		반복할 코드
		 * 
		 * }
		 */
		/*for (int i = 1; i < 101; i++) {
			System.out.println(i);
		}
	*/
		//1. 1부터 1000까지의 합 출력.
		
	/*	int sum = 0;
		for (int i = 1; i < 1001; i++) {
			sum += i;
		}
		System.out.println(sum);
	*/		
		//2. 1부터 100 중 짝수의 합 출력.
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println(sum);
		
		sum = 0;
		for (int i = 0; i < 101; i += 2) {
			sum += i;
		}
		System.out.println(sum);
		
		
		// 3. 구구단 3단을 출력
		
		for (int i = 1; i < 10; i++) {
			int a = 0;
			a = 3 * i;
			System.out.println("3x" + i + "=" + a);
		}
		
		/*for(int i = 2; i < 10; i++) {
			int a = 0;
			System.out.println(i + " X " + 1 + " = " + i * 1);
			System.out.println(i + " X " + 2 + " = " + i * 2);
			System.out.println(i + " X " + 3 + " = " + i * 3);
			System.out.println(i + " X " + 4 + " = " + i * 4);
			System.out.println(i + " X " + 5 + " = " + i * 5);
			System.out.println(i + " X " + 6 + " = " + i * 6);
			System.out.println(i + " X " + 7 + " = " + i * 7);
			System.out.println(i + " X " + 8 + " = " + i * 8);
			System.out.println(i + " X " + 9 + " = " + i * 9);
		}
		*/
		for(int i = 2; i < 10; i++) {
			for(int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + i*j);
			}
		}
		
		//5. Scanner를 이용해서, 출력하고 싶은 구구단 수를 입력 받으면 해당 구구단이 출력되는 코드
		// 1~9 <-- Scanner를 이용해서 보고 싶은 곱할 수를 입력 받는다.
		// 예 > 단수: 10
		// 	곱할 수 : 20
		//		출력예 > 10*1=10
		//		...
		//		10*20=200
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("구구단을 입력하세요");
		int i = keyboard.nextInt();
		System.out.println("숫자를 입력하세요");
		int j = keyboard.nextInt();
		for(int k = 1; k < j + 1; k++) {
			System.out.println(i + "x" + k + "=" + i*k);
		}
		//  Java  출력방법
		// System.out.println(); // ln --> line 출력한 뒤에 개행(엔터)
		// System.out.print(); // 출력한 뒤 개행 X
	}

}
