package homework240718;

/**
 * 판매자
 */
public class Seller2 {

	int stock; // 재고
	final int PRICE; // 판매금액 (상수로 정의 (대문자로))
	int money; // 금고

	public Seller (int stock, int PRICE, int money) {
		this.stock = stock;
		this.PRICE = price;
		this.money = money;
	}

	/**
	 * 판매자가 판매를 한다
	 * 
	 * @param quantity 판매하려는 수량
	 * @return 판매할 수 있는 수량
	 */
	public int sell(int quantity) {
		if (this.stock >= quantity) {
			this.stock -= quantity;
			this.money += this.PRICE * quantity;
			return quantity;
		}
		quantity = this.stock;
		this.money += this.PRICE * this.stock;
		this.stock = quantity;
		return quantity;
	}

	public void printSellerInfo() {
		System.out.println("판매자의 상품의 수: " + this.stock);
		System.out.println("판매자의 상품 가격: " + this.PRICE);
		System.out.println("판매자의 금고 현황: " + this.money);
	}
}
