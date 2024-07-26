package com.university.edu.extend.bar;

public class Sell {

	private int money;

	public int getMoney() {
		return this.money;
	}

	/**
	 * 음료 수량 빼는 클래스
	 */
	public int sellDrink(Drink drink, int quantity) {

		return drink.sellCount(quantity);

	}

	/*
	 * 바의 매출
	 */
	public void addCount(Drink drink, int quantity) {

		this.money += drink.addCount(quantity);

	}

	public void orderDrink(Consumer consumer, Drink drink, int quantity) {
		if (consumer.getAge() > 18) {
			if (consumer.getAlcohol() < 10) {

			}
		}

	}

}
