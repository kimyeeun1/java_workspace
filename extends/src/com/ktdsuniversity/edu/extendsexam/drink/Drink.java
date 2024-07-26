package com.ktdsuniversity.edu.extendsexam.drink;

public class Drink {

	private String name;

	public Drink(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void printDrink() {
		System.out.println(name);
	}

}
