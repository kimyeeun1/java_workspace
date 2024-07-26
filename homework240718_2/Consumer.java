package homework240718;

public class Consumer {
	
	int itemCount; // 구매 수량
	int consumerMoney; // 구매자의 잔액
	
	public Consumer (int itemCount, int consumerMoney) {
		
		this.itemCount = itemCount;
		this.consumerMoney = consumerMoney;
		
	}
	
	
	// 구매자가 상품을 구매하는 메소드
	public void buyItem (Seller seller, int quantity) { //Seller 클래스의 seller를 객체를 사용
		
		
		if (quantity > seller.itemStock) { //구매 수량이 판매자의 재고 개수 보다 많다면
			int itemTotalPrice = seller.itemPrice * seller.itemStock; // 총금액 변수 생성
			if (consumerMoney < itemTotalPrice) { // 구매자의 돈이 총 금액보다 적으면
				System.out.println("잔액이 부족합니다.");
			}
			else { // 구매자의 돈이 총 금액보다 많으면
				itemCount += seller.itemStock; // 구매 수량에 판매 재고 수 만큼 더한다.
				consumerMoney -= seller.itemPrice * itemCount; // 구매자의 잔액에 판매 상품 금액 * 구매수량(=판매재고수량)만큼 뺀다
				seller.sellItem(itemCount); //seller의 sellItem 메소드 호출
				System.out.println("판매완료");
			}
		}
		
		else {
			int itemTotalPrice = seller.itemPrice * quantity;
			if (consumerMoney < itemTotalPrice) { // 구매자의 돈이 총 금액보다 적으면
				System.out.println("잔액이 부족합니다.");
			}
			else { // 구매자의 돈이 총 금액보다 많으면
				itemCount += quantity; // 구매 수량에 수량 만큼 더한다.
				consumerMoney -= seller.itemPrice * quantity; // 구매자의 잔액에 판매 상품 금액 * 구매수량(=판매재고수량)만큼 뺀다
				seller.sellItem(quantity); //seller의 sellItem 메소드 호출
				System.out.println("판매완료");
			}
			
			
		}
		
	}
	
	
	// 구매자의 상태를 출력하는 메소드
	public void consumerStatus() {
		System.out.println("구매자의 상품 수: " + itemCount);
		System.out.println("구매자의 지갑 현황: " + consumerMoney);
	}

}
