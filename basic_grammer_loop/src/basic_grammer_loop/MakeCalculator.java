package basic_grammer_loop;

import java.util.Scanner;

public class MakeCalculator {

		
		
		/*7월 16일 과제.

		계산기 만들기
		세 개의 파라미터를 받아 결과를 반환하는 메소드를 만들어 호출합니다.
		각 파라미터는 문자열, 숫자, 숫자 로 구성되어야 합니다.
		
		문자열 파라미터에 할당될 수 있는 값은 "+", "-", "*", "/" 이며
		숫자 파라미터는 정수, 부동소수점 어느 것을 선택해도 됩니다.
		
		만약, 문자열 파라미터에 할당된 값이 "+" 라면, 두 숫자를 더해 결과를 반환하며
		"-" 라면 두 숫자를 뺀 결과를 반환하며
		"*" 라면 두 숫자를 곱한 결과를 반환해야 합니다.
		마지막으로 "/" 라면 두 숫자를 나눈 값을 반환해야 합니다.
		
		계산기는 무한히 반복하며 계산할 수 있어야 하며, 매 반복시 마다
		파라미터에 할당될 값을 입력할 수 있어야 합니다.
		
		"exit" 문자열을 입력하면 반복이 종료되어 애플리케이션이 종료되어야 합니다.
		
		*/

	
	
public static void menu() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("---------------------------------------");
			System.out.println("메뉴");
			System.out.println("1.계산하기");
			System.out.println("2.끝내기");			
			System.out.print("어떤 과정을 선택하시겠습니까? :");
			int choice = sc.nextInt();
			
			if(choice == 1) {
				
				cal();
				
				
			}else if(choice == 2) {
				System.out.print("정말 끝낼려면 exit를 입력하세요 ,아니라면 게속을 continue를 입력하세요");
				String ask = sc.next();
				if(ask.equals("exit")) {
					break;					
				}else if(ask.equals("continue")){
					continue;
				}
				
			}else {
				
				System.out.println("잘못된 메뉴를 선택하셨습니다. 다시 선택해주세요");
			}
			
			System.out.println("---------------------------------------");

		}//while
	}//menu 메소드 끝
	
	
	public static void cal() {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("첫번째 숫자를 입력해주세요");
			int num1 =sc.nextInt();
			System.out.print("두번째 숫자를 입력해주세요");
			int num2 = sc.nextInt();
			
			sc.nextLine();
			
			System.out.print("연산자를 입력해주세요( + , - , * , / )");
			String operator = sc.nextLine();
			
			
			if(operator.equals("+")) {
				System.out.println("더하기 연산을 한 결과값은 '" +(num1 + num2)+ " ' 입니다" );
			} else if(operator.equals("-")) {
				System.out.println("빼기 연산을 한 결과값은 '" +(num1 - num2)+ " ' 입니다" );
			} else if(operator.equals("*")) {
				System.out.println("곱하기 연산을 한 결과값은 '" +(num1 * num2)+ " ' 입니다" );
			} else if(operator.equals("/")) {
				System.out.println("나누기 연산을 한 결과값은 '" +(num1 / num2)+ " ' 입니다" );
			} 
		
			System.out.println("게속하시겠습니까 ?(exit / continue) : ");
			
			String end = sc.nextLine();
			
			if(end.equals("exit")) {
				break;
			}else if(end.equals("continue")) {
				continue;
			}
			
			
		}//while
	}//cal 메소드
	
	public static void main(String[] args) {
	
		
		
		System.out.println("지금부터 숫자를 입력받아 계산 해보겠습니다");
		menu();
		System.out.println("프로그램을 종료합니다");	
	
	}
	
}
