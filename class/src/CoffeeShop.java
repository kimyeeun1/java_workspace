
public class CoffeeShop {
	String iceAmericanoName;
	int iceAmericano;

	String hotAmericanoName;
	int hotAmericano;

	/**
	 * 생성자
	 */
	public CoffeeShop(String iceAmericanoName, int iceAmericano, String hotAmericanoName, int hotAmericano) {

		this.iceAmericano = iceAmericano;
		this.iceAmericanoName = iceAmericanoName;
		this.hotAmericano = hotAmericano;
		this.hotAmericanoName = hotAmericanoName;

	}

	public int orderCoffee(int menu, int quantity) {

		if (menu == 1) {
			return this.iceAmericano * quantity;
		}
		return this.hotAmericano * quantity;
	}
}
