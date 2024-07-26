package homework240718;

public class MarketPlace {

	public static void main(String[] args) {

		Seller shoeMarker = new Seller(100, 150_000, 1_000);
		Buyer me = new Buyer(1_000_000);

		int orderCount = 2;

		if (orderCount * shoeMarker.PRICE <= me.money) {
			int orderQuantity = shoeMarker.sell(orderCount);

			me.buy(orderQuantity, orderQuantity * shoeMarker);
		}
	}
}
