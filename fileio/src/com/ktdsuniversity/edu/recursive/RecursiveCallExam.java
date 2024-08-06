package com.ktdsuniversity.edu.recursive;

public class RecursiveCallExam {

	public void call(int count) {
		System.out.println("call 메소드가 호출되었습니다." + count + "번째");

		// 재귀 호출은 Call Stack 이 한도만큼 쌓이면 애플리케이션을 강제로 죽인다
		// 멀티쓰레드 환경에서 CPU Idle 타임을 모두 독점한다
		if (count < 10) {
			call(count + 1); // <------ Recursive Call
		}

		System.out.println("재귀호출이 종료 되었습니다." + count);
	}

	public static void main(String[] args) {
		RecursiveCallExam rcExam = new RecursiveCallExam();
		rcExam.call(1); // 메소드 최초 호출
	}

}
