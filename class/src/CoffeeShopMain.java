
public class CoffeeShopMain {
	public static void main(String[] args) {

		CoffeeShop tomAndToms = new CoffeeShop("아이스 아메리카노", 5500, "따뜻한 아메리카노", 5000);
		// tomAndToms.iceAmericano = 5500;
		// tomAndToms.hotAmericano = 5000;
		CoffeeShop mammoth = new CoffeeShop("저렴한 아아", 1400, "저렴한 뜨아", 1200);
		// mammoth.iceAmericano = 1400;
		// mammoth.hotAmericano = 1200;

		int tomAndTomsIceAmericanoPrice = tomAndToms.orderCoffee(1, 10);
		int tomAndTomsHotAmericanoPrice = tomAndToms.orderCoffee(2, 5);

		System.out.println("탐탐 " + tomAndToms.iceAmericanoName + ": " + tomAndToms.iceAmericano);
		System.out.println("탐탐 " + tomAndToms.hotAmericanoName + ": " + tomAndToms.hotAmericano);

		int mammothIceAmericanoPrice = mammoth.orderCoffee(1, 10);
		int mammothHotAmericanoPrice = mammoth.orderCoffee(2, 5);

		System.out.println("메머드 아아: " + mammothIceAmericanoPrice);
		System.out.println("메머드 뜨아: " + mammothHotAmericanoPrice);

	}

}
