/**
 * 클래스의 멤버변수 / 클래스의 메소드를 사용하려면 반드시 클래스를 변수로 생성을 해야한다!!
 */
public class ScoreManager {

	Student kim;
	Student lee;
	Student park;
	Student choi;

	public int getSum() {
		return kim.getSum() + lee.getSum() + park.getSum() + choi.getSum();
	}

	public double getAverage() {
		return getSum() / 4.0;
	}

	public static void main(String[] args) {

		ScoreManager manager = new ScoreManager();

		manager.kim = new Student();
		manager.kim.korScore = 100;
		manager.kim.engScore = 100;
		manager.kim.mathScore = 100;

		manager.lee = new Student();
		manager.lee.korScore = 100;
		manager.lee.engScore = 100;
		manager.lee.mathScore = 100;

		manager.park = new Student();
		manager.park.korScore = 100;
		manager.park.engScore = 100;
		manager.park.mathScore = 100;

		manager.choi = new Student();
		manager.choi.korScore = 100;
		manager.choi.engScore = 100;
		manager.choi.mathScore = 100;

		int sum = manager.getSum();
		double average = manager.getAverage();
		System.out.println("합계: " + sum);
		System.out.println("평균: " + average);
	}
}
