package com.ktdsuniversity.edu.collection.first.school;

import java.util.ArrayList;
import java.util.List;

public class School {

	private List<Student> studentList;

	public School() {
		// FIXME studentList 초기화
		studentList = new ArrayList<>();
	}

	public void addStudent(Student student) {
		// FIXME studentList에 학생 추가
		// 이미 등록된 학생은 추가 불가
		if (!this.studentList.contains(student)) {
			this.studentList.add(student);
		}
	}

	public void removestudent(String name) {
		// if (index < 0 || index >= this.studentList.size()) {
		// throw new IndexOutOfBoundsException(index);
		// }
		// FIXME 해당 인덱스의 학생을 삭제
		int index = this.studentList.indexOf(new Student("김자바", 100, 90));
		this.studentList.remove(index);
	}

	public Student getStudent(int index) {
		// FIXME 해당 인덱스의 학생을 반환
		return studentList.get(index);
	}

	public int getSumScores() {
		// FIXME 모든 학생들의 점수 총합 반환
		int sumScores = 0;
		for (Student eachSumScore : studentList) {
			sumScores += eachSumScore.getSumScore();
		}
		return sumScores;
	}

	public double getAverageScores() {
		// FIXME 모든 학생들의 점수 평균을 반환
		double averageScores = 0;
		for (Student eachAverageScores : studentList) {
			averageScores += eachAverageScores.getAverageScore();
		}
		return averageScores / studentList.size();
	}

	@Override
	public String toString() {
		// TODO 모든 학생들의 정보를 출력
		// Student 클래스의 toString을 이용
		StringBuffer sb = new StringBuffer();
		for (Student information : studentList) {
			sb.append(information + "\n");
		}
		return sb.toString();
	}

}
