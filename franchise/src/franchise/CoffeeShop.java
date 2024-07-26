package franchise;

/**
 * 
 */
public class CoffeeShop {

	Coffee iceAmericano;
	Coffee hotAmericano;

	public CoffeeShop(Coffee iceAmericano, Coffee hotAmericano) {
		this.iceAmericano = iceAmericano;
		this.hotAmericano = hotAmericano;
	}

	/**
	 * 커피숍에서 음료를 주문한다.
	 * 
	 * @param menu     : 주문할 음료의 번호(1: 아이스, 0: 핫)
	 * @param quantity : 주문할 수량
	 * @price : 주문 총액
	 */
	public int orderCoffee(int menu, int quantity) {
		if (menu == 1) {
			System.out.println(this.iceAmericano.name + "을 주문합니다.");
			return this.iceAmericano.price * quantity;
		}

		System.out.println(this.hotAmericano.name + "을 주문합니다.");
		return this.hotAmericano.price * quantity;
	}
}
