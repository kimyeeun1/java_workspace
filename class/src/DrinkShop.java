/**
 * 자판기 4개의 Drink를 판매하는 자판기
 */
public class DrinkShop { // 4개의 Drink를 멤버 변수로 만듬
	private Drink bacchus; // 음료수1
	private Drink monster; // 음료수2
	private Drink hotsix; // 음료수3
	private Drink milkis; // 음료수4

	public DrinkShop(Drink bacchus, Drink monster, Drink hotsix, Drink milkis) {
		this.bacchus = bacchus;
		this.monster = monster;
		this.hotsix = hotsix;
		this.milkis = milkis;
	}

	// 총 가격을 구하는 함수
	public int getTotalPrice(Drink drink, int quantity) {
		return drink.getPrice() * quantity;
	}

	// 총 수량을 구해서 빼는 함수
	public int getTotalMount(Drink drink, int quantity) {
		return drink.getMount() - quantity;
	}

	// 음료 주문하는 함수
	public Drink orderDrink(String drinkName, int quantity) {
		// 이름이 바카스인 경우 아래 코드 실행
		if (this.bacchus.getDrinkName().equals(drinkName)) {
			// 재고가 없는 경우
			if (bacchus.getMount() < quantity) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			int price = getTotalPrice(this.bacchus, quantity);
			getTotalMount(this.bacchus, quantity);

			Drink outputdrink = new Drink(drinkName, price, quantity);
			return outputdrink;
		}
		// 몬스터인 경우
		else if (this.monster.getDrinkName().equals(drinkName)) {
			getTotalMount(this.monster, quantity);
			int price = getTotalPrice(this.monster, quantity);

			// 몬스터 재고가 없는 경우
			if (monster.getMount() < quantity) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			return new Drink(drinkName, price, quantity);
		}

		// 핫식스인 경우
		else if (this.hotsix.getDrinkName().equals(drinkName)) {
			getTotalMount(this.hotsix, quantity);
			int price = getTotalPrice(this.hotsix, quantity);

			// 핫식스 재고가 없는 경우
			if (hotsix.getMount() < quantity) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			return new Drink(drinkName, price, quantity);
		}

		else if (this.milkis.getDrinkName().equals(drinkName)) {
			getTotalMount(this.milkis, quantity);
			int price = getTotalPrice(this.milkis, quantity);

			// 밀키스 재고가 없는 경우
			if (milkis.getMount() < quantity) {
				System.out.println("상품이 품절되었습니다.");
				return null;
			}
			return new Drink(drinkName, price, quantity);
		}

		else {

		}
		return null; // 메모리에 할당된 데이터가 없는 상태
	}

	// 제품을 입고하는 함수를 아래에 작성.
	// 입고하기(제품명, 입고수량): void
	// 입고를 하면 입고 수량만큼 재고가 증가된다.
	public int mountAdd(Drink drink, int quantity) {
		return drink.getMount() + quantity;
	}

	public void storeDrink(String drinkName, int quantity) {
		if (bacchus.getDrinkName().equals(drinkName)) {
			mountAdd(this.bacchus, quantity);
		} else if (monster.getDrinkName().equals(drinkName)) {
			mountAdd(this.monster, quantity);
		} else if (hotsix.getDrinkName().equals(drinkName)) {
			mountAdd(this.hotsix, quantity);
		} else if (milkis.getDrinkName().equals(drinkName)) {
			mountAdd(this.milkis, quantity);
		}
		return;
	}

	// 재고 출력
	public void stockDrink() {
		System.out.println(bacchus.getDrinkName() + ": " + bacchus.getMount() + "개");
		System.out.println(monster.getDrinkName() + ": " + monster.getMount() + "개");
		System.out.println(hotsix.getDrinkName() + ": " + hotsix.getMount() + "개");
		System.out.println(milkis.getDrinkName() + ": " + milkis.getMount() + "개");
	}

}
