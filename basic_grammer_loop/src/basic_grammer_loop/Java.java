package basic_grammer_loop;

import java.util.Scanner;

public class Java {
	public static void main(String[] args) {
		/*1. 손님이 영화관에 10000원을 가지고 입장했습니다.
			손님은 관람비가 18000원인 영화를 관람하려 합니다.
			손님은 영화를 관람할 수 있을까요?
			관람할 수 있다면, "관람가능"을 출력하고 지불하고 남은 금액을 출력합니다.
			관람할 수 없다면, "관람불가능"을 출력하고 모자란 금액을 출력합니다.
		*/
		int cash = 10000;
		if (cash <= 18000) {
			System.out.println("관람가능");
		}
		else {
			System.out.println("관람불가능");
		}
		
		
		
		
		
		/* 2. 무한 구구단을 출력합니다.
		사용자가 입력한 구구단의 결과를 출력합니다.
		만약, 3을 입력했다면, 구구단 3단을 출력합니다.
		만약, -1을 입력했다면, 구구단 출력 프로그램을 종료해야합니다.
		*/
		Scanner keyboard = new Scanner(System.in);
		int i = keyboard.nextInt();
		while (i != -1) { //i가 -1과 같지 않을 때 반복
			
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "x" + j + "=" + i*j);
			}
			i = keyboard.nextInt();
		}
		
		
		
		
		
		/* 	3.아래 결과가 나오게 반복문을 작성해보세요.
		  	*
		 	**
		 	***
		 	****
		 	*****
		 */
		
		for(int a = 1; a < 6; a++) { // 정수 a가 6 미만까지 반복
			for(int b = 1; b <= a; b++) { //정수 b가 a보다 작거나 같을 때
				System.out.print("*"); // *을 줄바꿈 없이 프린트
			}
			System.out.println(); // b가 a보다 큰 경우 줄바꿈
		}
		
	}

}
