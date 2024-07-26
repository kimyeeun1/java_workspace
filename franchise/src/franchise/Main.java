package franchise;

public class Main {
	public static void main(String[] args) {
		Coffee ice = new Coffee("아이스 아메리카노", 2500);
		Coffee hot = new Coffee("따뜻한 아메리카노", 2000);

		CoffeeShop cs = new CoffeeShop(ice, hot);
		// 아이스 아메리카노 5잔 주문
		int price = cs.orderCoffee(1, 5);
		System.out.println(price);
	}
}
