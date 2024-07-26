package com.ktdsuniversity.edu.array;

public class ClassRoomMain {

	public static void main(String[] args) {

		ClassRoom classRoom = new ClassRoom(3);
		classRoom.addStudent(0, new Student(100, 100, 100, 100));
		classRoom.addStudent(1, new Student(80, 90, 88, 77));
		classRoom.addStudent(2, new Student(77, 75, 89, 98));

		int sumScore = classRoom.getSumAllScores();
		double average = classRoom.getAverage();
		double courseCredit = classRoom.getCourseCredit();
		String grade = classRoom.getABCDE();

		System.out.println("학급 성적 총합은 " + sumScore + "입니다.");
		System.out.println("학급 성적 평균은 " + average + "입니다.");
		System.out.println("학급 성적 학점은 " + courseCredit + "입니다.");
		System.out.println("학급 성적 등급은 " + grade + "입니다.");
	}

}
