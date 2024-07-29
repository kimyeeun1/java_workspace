package homework240724;

public abstract class FreeBar {

	private Drink[] drinks;
	private Consumer consumer;
	private int barMoney;
	private int totalPrice;

	public FreeBar(Consumer consumer) {
		this.consumer = consumer;

		drinks = new Drink[] { new Alcohol("소주", 5000, 13.5), new Alcohol("맥주", 3500, 5.0),
				new Alcohol("막걸리", 4000, 5.0), new Alcohol("청하", 6000, 13.0), new Juice("콜라", 2000) };

	}

	public void totalPrice(int index, int quantity) {

		totalPrice = drinks[index].getPrice() * quantity;
	}

	public void totalMoney() {

		barMoney += totalPrice;

	}

	/*
	 * public boolean trueAdult() { return isAdult(); }
	 */

	public void sellDrink(String name, int quantity) {
		if (drinks.length != 0) {
			for (int i = 0; i < drinks.length; i++) {
				Drink drink = drinks[i];
				if (drink != null && drink.getName() != null) {
					if (drink.getName().equals(name)) {
						// if(consumer.getAge() < 19) {
						if (!isAdult()) {
							System.out.println("미성년자에겐 주류를 판매할 수 없습니다.");
							return;
						}
						if (!isDrunken()) {
							System.out.println("만취자에겐 주류를 판매할 수 없습니다.");
							return;
						} else {
							totalPrice(i, quantity);
							System.out.println(name + "의 금액은 " + totalPrice + "입니다.");
							totalMoney();
							System.out.println("총 매출액: " + barMoney + "원");
							break;
						}
					}
				}
			}
		}
	}

	public abstract boolean isAdult();

	public abstract boolean isDrunken();

}
