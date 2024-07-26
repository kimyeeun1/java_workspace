
public class Cartoon {

	private String name;
	private boolean rental;
	private final int PRICE = 1000;
	private int money;
	
	public Cartoon (boolean rental, int money) {
		this.rental = rental;
		this.money = money;
	}
	
	public int RetalBook (int quantity) {
		if (rental) {
			return money += PRICE * quantity;
		}
		return 0;
	}
	
	public 
	
}
