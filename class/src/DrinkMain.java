
public class DrinkMain {

	public static void main(String[] args) {

		Drink bacchus = new Drink("박카스", 900, 15);
		Drink monster = new Drink("몬스터", 1500, 20);
		Drink hotsix = new Drink("핫식스", 1300, 10);
		Drink milkis = new Drink("밀키스", 1400, 5);

		DrinkShop drink = new DrinkShop(bacchus, monster, hotsix, milkis);

		drink.stockDrink();

		Drink myDrink = drink.orderDrink("박카스", 13);
		// System.out.println(myDrink); // 메모리 주소 출력
		System.out.println("구매한 상품의 이름: " + myDrink.getDrinkName());
		System.out.println("구매한 상품의 가격: " + myDrink.getPrice());
		System.out.println("구매한 상품의 재고: " + myDrink.getMount());

		drink.stockDrink();
	}

}
