package homework240718;

public class BuyItem {

	public static void main(String[] args) {
		Seller seller = new Seller(35, 1500, 100_000);
		Consumer consumer = new Consumer(0, 8_000);
		
		seller.sellerStatus();
		consumer.consumerStatus();
		
		consumer.buyItem(seller, 4);
		seller.sellerStatus();
		consumer.consumerStatus();
		
		consumer.buyItem(seller, 20);
		seller.sellerStatus();
		consumer.consumerStatus();
	}
}