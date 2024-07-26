package homework240724;

public class Alcohol extends Drink {
	
	private double alcohol;
	
	public Alcohol (String name, int price, double alcohol) {
		
		super(name, price);
		this.alcohol = alcohol;
		
	}
	
	public double getAlcohol() {
		
		return alcohol;
		
	}

}
