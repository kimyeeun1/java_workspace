package homework240724;

public class BarMain {

	public static void main(String[] args) {
		Consumer consumer = new Consumer(20, 4);
		FreeBar bar = new Bar(consumer);

		bar.sellDrink("맥주", 5);
		bar.sellDrink("청하", 5);

	}

}
