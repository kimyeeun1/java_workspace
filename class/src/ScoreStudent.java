
public class ScoreStudent {
	public static void main(String[] args) {
		StudentScore yeeun = new StudentScore();
		yeeun.java = 100;
		yeeun.python = 97;
		yeeun.cpp = 81;
		yeeun.csharp = 99;

		int sum = yeeun.getSumAllScores();
		double average = yeeun.getAverage();
		double credit = yeeun.getCourseCredit();
		String abcde = yeeun.getABCDE();

		System.out.println("합계는 " + sum + "점 입니다.");
		System.out.println("평균은 " + average + "점 입니다.");
		System.out.println("학점은 " + credit + "입니다.");
		System.out.println("등급은 " + abcde + "입니다.");
	}

}
