package com.ktdsuniversity.edu.array;

public class ClassRoom {
	private Student[] students;

	public ClassRoom(int count) {
		this.students = new Student[count];
	}

	public int getSumAllScores() {
		int sum = 0;
		for (int i = 0; i < students.length; i++) {
			sum += students[i].getSumAllScores();
		}

		return sum;
	}

	public double getAverage() {
		return getSumAllScores() / 4 / students.length;
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

	public void addStudent(int index, Student student) {
		students[index] = student;

	}
}
