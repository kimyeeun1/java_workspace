/**
 * 한 학생의 점수를 관리
 */
public class Student {
	/**
	 * 국어 점수
	 */
	int korScore;

	/**
	 * 영어 점수
	 */
	int engScore;

	/**
	 * 수학 점수
	 */
	int mathScore;

	public int getSum() {
		return korScore + engScore + mathScore;
	}
}
