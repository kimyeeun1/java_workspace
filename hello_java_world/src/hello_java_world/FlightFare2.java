package hello_java_world;

import java.util.Scanner;

public class FlightFare2 {
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
		
		int adultCount = 0;
		int kidCount = 0;
		
		if (father >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		if (mother >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		if (daughter >= 19) {
			adultCount++;
		}
		else {
			kidCount++;
		}
		
		int flightFare = adultOneWayFlightFare * adultCount + kidOneWayFlightFare * kidCount;
		
		System.out.println("성인: " + adultCount + "명");
		System.out.println("아동: " + kidCount + "명");
		
	}
}
