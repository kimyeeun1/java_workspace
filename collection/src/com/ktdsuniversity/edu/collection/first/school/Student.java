package com.ktdsuniversity.edu.collection.first.school;

public class Student {

	private String name;
	private int javaScore;
	private int frontScore;

	public Student(String name, int javaScore, int frontScore) {
		this.name = name;
		this.javaScore = javaScore;
		this.frontScore = frontScore;
	}

	public String getName() {
		return name;
	}

	public int getSumScore() {
		// FIXME
		return javaScore + frontScore;
	}

	public double getAverageScore() {
		// FIXME
		return getSumScore() / 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student otherStudent = (Student) obj;

			return this.name.equals(otherStudent.name);
		} else if (obj instanceof String) {
			return this.equals(obj);
		}

		return false;
	}

	@Override
	public String toString() {
		String format = "이름: %s, Java: %d, Front: %d";
		return String.format(format, this.name, this.javaScore, this.frontScore);
	}
}
