package com.ktdsuniversity.edu.array;

public class Student {

	private int java;
	private int python;
	private int cpp;
	private int csharp;

	public Student(int java, int python, int cpp, int csharp) {
		this.java = java;
		this.python = python;
		this.cpp = cpp;
		this.csharp = csharp;
	}

	public int getSumAllScores() {
		return java + python + cpp + csharp;
	}

	public double getAverage() {
		return getSumAllScores() / 4;
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
