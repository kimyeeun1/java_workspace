
/**
 * 자판기에서 판매하는 상품
 */
public class Drink {
	private String name; // 상품의 이름
	private int price; // 상품의 가격
	private int mount; // 상품의 재고

	public Drink(String name, int price, int mount) { // 클래스 이름과 같은 생성자 이름(Drink)

		this.name = name;
		this.price = price;
		this.mount = mount;

	}

	public String getDrinkName() {
		return name;
	}

	public int getPrice() {
		return price;
	}

	public int getMount() {
		return mount;
	}

	public int totalMount(int quantity) {
		return mount - quantity;
	}
}
