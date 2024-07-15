package hello_java_world;

public class Average {
	public static void main(String[] args) {
		int korScore = 90;
		int engScore = 88;
		int mathScore = 70;
		int progScore = 80;
		
		int sum = 0;
		int average = 0;
		
		String a = "";
		
		sum = korScore + engScore + mathScore + progScore;
		average = sum / 4;
		
		if (average >= 95) {
			a = "A+";
		}
		
		else if (average >= 90) {
			a = "A";
		}
		
		else if (average >= 85) {
			a = "B+";
		}
		
		else if (average >= 80) {
			a = "B";
		}
		
		else if (average >= 70) {
			a = "C";
		}
		
		else if (average < 70) {
			a = "F";
		}
		
		System.out.println(a);
	}

}
