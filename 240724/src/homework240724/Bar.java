package homework240724;

public class Bar extends FreeBar {

	protected Consumer consumer;

	public Bar(Consumer consumer) {
		super(consumer);
		this.consumer = consumer;
	}

	public boolean isAdult() {
		if (consumer.getAge() > 18) {
			return true;
		}
		return false;
	}

	public boolean isDrunken() {
		if (consumer.getAlcoholGauge() < 5) {
			return true;
		}
		return false;
	}

	/*
	 * public void sellDrink(String name, int quantity) { for(int i = 0; i <
	 * drinks.length; i++) { Drink drink = drinks[i];
	 * if(drink.getName().equals(name)) { if(consumer.getAge() < 19) {
	 * System.out.println("미성년자에겐 주류를 판매할 수 없습니다."); return; }
	 * if(consumer.getAlcoholGauge() > 4) {
	 * System.out.println("만취자에겐 주류를 판매할 수 없습니다."); return; } else { totalPrice(i,
	 * quantity); System.out.println(name + "의 금액은 " + totalPrice + "입니다.");
	 * totalMoney(); System.out.println("총 매출액: " + barMoney + "원"); break; } } } }
	 */

}
