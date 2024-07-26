package homework240718;

public class Seller {
	
	int itemStock; // 판매재고수
	int itemPrice; // 판매가격
	int sellerMoney; // 판매자 잔고
	
	public Seller (int itemStock, int itemPrice, int sellerMoney) {
		
		this.itemStock = itemStock;
		this.itemPrice = itemPrice;
		this.sellerMoney = sellerMoney;
		
	}
	
	// 판매자가 상품을 판매하는 메소드
	public void sellItem (int quantity) {
		
		itemStock -= quantity; // 판매재고에 개수만큼 차감
		sellerMoney += itemPrice * quantity; // 판매자 잔고에 판매금액만큼 추가
		
	}
	
	// 판매자의 상태를 출력하는 메소드
	public void sellerStatus() {
		System.out.println("판매자의 상품 수: " + itemStock);
		System.out.println("판매자의 상품 가격: " + itemPrice);
		System.out.println("판매자의 금고 현황: " + sellerMoney); 
	}

}
