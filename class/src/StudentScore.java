
public class StudentScore {

	int java;
	int python;
	int cpp;
	int csharp;

	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}

	public double getAverage() {
		return getSumAllScores() / 4.0;
	}

	public double getCourseCredit() {
		return (getAverage() - 55) / 10;
	}

	public String getABCDE() {
		if (getCourseCredit() >= 4.1) {
			return "A+";
		} else if (getCourseCredit() >= 3.6) {
			return "A";
		} else if (getCourseCredit() >= 3.1) {
			return "B+";
		} else if (getCourseCredit() >= 2.6) {
			return "B";
		} else if (getCourseCredit() >= 1.6) {
			return "C";
		} else if (getCourseCredit() >= 0.6) {
			return "D";
		} else {
			return "F";
		}

	}
}
