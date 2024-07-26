
public class Coffee {

	public static void main(String[] args) {

		CoffeeMachine cong = new CoffeeMachine();
		cong.remainWater = 100;
		cong.waterHiter = 80;
		cong.extractCoffee = "정지";
		cong.coffeeGrinder = "정지";

		System.out.println("물의 양: " + cong.remainWater);
		System.out.println("현재 물의 온도: " + cong.waterHiter);
		System.out.println("커피 분쇄: " + cong.coffeeGrinder);
		System.out.println("커피 추출: " + cong.extractCoffee);

		cong.chooseTemperature();
		cong.chooseTemperature();
		cong.chooseTemperature();
		cong.chooseTemperature();

		cong.grinding();

		cong.makeCoffee();
		cong.waterExhaust();

		System.out.println("물의 양: " + cong.remainWater);
		System.out.println("현재 물의 온도: " + cong.waterHiter);
		System.out.println("커피 분쇄: " + cong.coffeeGrinder);
		System.out.println("커피 추출: " + cong.extractCoffee);

	}
}
