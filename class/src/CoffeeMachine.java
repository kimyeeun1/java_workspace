
public class CoffeeMachine {

	/**
	 * 물통에 남은 물의 양
	 */
	double remainWater;

	/**
	 * 물의 온도
	 */
	int waterHiter;

	/**
	 * 커피 추출 버튼
	 */
	String extractCoffee;

	/**
	 * 커피 분쇄기
	 */
	String coffeeGrinder;

	/**
	 * 물 배출
	 */
	public void waterExhaust() {
		if (remainWater > 0) {
			remainWater--;
		}

	}

	/**
	 * 물 온도 조절
	 */
	public void chooseTemperature() {
		if (waterHiter < 101) {
			waterHiter += 5;
		}
	}

	/**
	 * 커피 콩 분쇄 기능 0 = 정지 1 = 분쇄
	 */
	public void grinding() {
		if (coffeeGrinder.equals("정지")) {
			coffeeGrinder = "시작";
		} else {
			coffeeGrinder = "정지";
		}

	}

	/**
	 * 커피 추출 기능 0 = 정지 1 = 추출
	 */
	public void makeCoffee() {
		if (extractCoffee.equals("정지")) {
			extractCoffee = "시작";
		} else {
			extractCoffee = "정지";
		}

	}

}
