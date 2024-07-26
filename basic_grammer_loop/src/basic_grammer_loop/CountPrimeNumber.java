package basic_grammer_loop;

import java.util.Scanner;

/*

		2. 1 부터 10000 사이에 몇 개의 소수(Prime Number)가 있는지 세어 출력하는
		메소드를 만들고 호출해보세요.

 */

public class CountPrimeNumber {
	
	
public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("메뉴");
			System.out.println("1.소수 갯수구하기");
			System.out.println("2.끝내기");
			System.out.print("어떤 과정을 선택하시겠습니까? :");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
				int count = cal();
				
				System.out.println("입력한 숫자까지에 소수에 갯수는 '" + count + "' 입니다");
				
				
			}else if(choice == 2) {
				
				break;
				
			}else {
				
				System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요");
			}
			
			System.out.println("---------------------------------------");

		}//while
	}//menu 메소드 끝
	
	
	
	
	public static int cal() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소수를 구할 숫자의 범위를 입력하세요 : ");
		int num= sc.nextInt(); //첫번째 숫자
		
		
		int count =0; //첫번째 숫자까지의 소수갯수 ( 1과 자기자신을 포함하지않은 소수의 갯수 )
		
		
		for(int i =2 ; i<num ; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		
		
		return count;
	}//소수 계산 메소드 끝
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("지금부터 소수에 갯수를 구하는 프로그램을 시작해보겠습니다");
		menu();
		System.out.println("프로그램을 종료합니다");		

	}
}
