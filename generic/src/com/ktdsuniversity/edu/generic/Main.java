package com.ktdsuniversity.edu.generic;

public class Main {

	public static void main(String[] args) {

		// Generic 이 정의된 클래스를 아래처럼 만들면
		// 노란줄로 경고가 나타남

		ScoreList<Integer> scoreList = new ScoreList<>();
		scoreList.add(100);
		scoreList.add(90);
		scoreList.add(80);
		scoreList.add(70);

		System.out.println(scoreList);

		int score = scoreList.get(0);
		System.out.println(score);

		score = scoreList.get(1);
		System.out.println(score);

		score = scoreList.get(2);
		System.out.println(score);

		score = scoreList.get(3);
		System.out.println(score);

		int size = scoreList.getSize();
		System.out.println(size + "개의 점수가 등록됨");
	}
}
