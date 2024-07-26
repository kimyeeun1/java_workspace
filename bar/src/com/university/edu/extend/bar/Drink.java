package com.university.edu.extend.bar;

public class Drink {

	private String name;
	private int count;
	private int price;

	public Drink(String name, int count, int price) {

		this.name = name;
		this.count = count;
		this.price = price;

	}

	public String getName() {
		return name;
	}

	public int getCount() {

		return count;

	}

	public int getPrice() {

		return price;

	}

	public int sellCount(int quantity) {

		return this.count - quantity;

	}

	public int addCount(int quantity) {

		return this.price * quantity;

	}

}
