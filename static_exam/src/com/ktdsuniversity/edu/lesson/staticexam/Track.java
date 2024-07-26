package com.ktdsuniversity.edu.lesson.staticexam;

public class Track {
	public static void main(String[] args) {

		Car matiz = new Car(Car.SMALL, "마티즈");
		matiz.startEngine();

		Car kona = new Car(Car.MIDEUM, "코나");
		kona.startEngine();

		Car g90 = new Car(Car.LARGE, "제네시스");
		g90.startEngine();

		System.out.println(StringUtils.isEmpty(""));
		System.out.println(StringUtils.isEmpty("AAA"));
		System.out.println(StringUtils.isNumber("1"));
		System.out.println(StringUtils.isNumber("a"));
	}
}
