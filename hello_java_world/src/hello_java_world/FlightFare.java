package hello_java_world;

import java.util.Scanner;

public class FlightFare {
	public static void main(String[] args) {
		int money = 1_000_000;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("아빠나이 : ");
		int father = keyboard.nextInt();
		System.out.println("엄마나이 : ");
		int mother = keyboard.nextInt();
		System.out.println("자녀나이 : ");			
		int daughter = keyboard.nextInt();
		
		int adultOneWayFlightFare = 300_000;
		int kidOneWayFlightFare = 120_000;
		
		int sum = 0;
		
		if (father >= 19) {
			sum += adultOneWayFlightFare;
		}
		
		if (mother >= 19) {
			sum += adultOneWayFlightFare;
		}
		
		if (daughter >= 19) {
			sum += adultOneWayFlightFare;
		}
		
		System.out.println("필요경부 : " + sum);
		System.out.println("준비된 현금: " + money);
		
		if ( money >= sum) {
			System.out.println("여행가자!");
		}
		
		else {
			System.out.println("다음에 가자!");
		}
	}

}