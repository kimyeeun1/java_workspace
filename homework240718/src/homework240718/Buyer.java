package homework240718;

/**
 * 구매자
 * 
 */
public class Buyer {

	int itemCount; // 구매수량
	int money; // 잔액

	public Buyer(int money) {
		this.money = money;
	}

	/**
	 * 구매자가 구매를 한다
	 * 
	 * @param quantity 구매할 수량
	 * @param price    구매할 수량 * 판매 상품의 단가
	 */
	public void buy(int quantity, int price) {
		if (this.money >= price) {
			this.money -= price;
			this.itemCount += quantity;
			return;
		}
	}

	public void printBuyerInfo() {
		System.out.println("구매자의 상품 수: " + this.itemCount + "개");
		System.out.println("구매자의 지갑 현황: " + this.money + "원");
	}

}
