package basic_grammer_loop;


import java.util.Scanner;

/*
 * 파라미터로 정수를 전달하면, 해당 숫자가 소수(Prime number)인지 확인하고
	소수라면 true, 아니라면 false를 반환시키는 메소드를 만들고 실행 후 결과를 출력해보세요.
 */


public class CheckPrimeNumber {

	
	
	
	public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("메뉴");
			System.out.println("1.소수 판별하기");
			System.out.println("2.끝내기");
			System.out.print("어떤 과정을 선택하시겠습니까? :");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
				int count = cal();
				
				if(count == 0 ) {
					
					System.out.println("true");
				} else {
					System.out.println("false");
				}
				
			
			
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
		
		System.out.print("판별할 숫자를 입력하세요 : ");
		
		int num= sc.nextInt();
		int count = 0;
		
		for(int i =2 ; i<num ; i++) {
			if(num % i == 0) {
				count++;
			}
		}
		
		return count;
	}//소수 계산 메소드 끝
	
	
	
	
	
	
	public static void main(String[] args) {
		
		System.out.println("지금부터 소수를 판별하는 프로그램을 시작해보겠습니다");
		menu();
		System.out.println("프로그램을 종료합니다");		

	}
}
