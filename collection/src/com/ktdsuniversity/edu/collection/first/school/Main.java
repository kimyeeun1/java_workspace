package com.ktdsuniversity.edu.collection.first.school;

public class Main {

	public static void main(String[] args) {

		School school = new School();

		Student student1 = new Student("김자바", 100, 80);
		Student student2 = new Student("이자바", 90, 80);
		Student student3 = new Student("박자바", 90, 80);

		school.addStudent(student1);
		school.addStudent(student1);
		school.addStudent(student1);
		school.addStudent(student2);
		school.addStudent(student3);
		school.addStudent(new Student("김자바", 100, 100));
		school.addStudent(new Student("김자바", 100, 100));
		school.addStudent(new Student("김자바", 100, 100));
		school.addStudent(new Student("김자바", 100, 100));

		school.removestudent("김자바");

		System.out.println(school.getAverageScores());
		System.out.println(school.getSumScores());

		System.out.println(school);

	}

}
