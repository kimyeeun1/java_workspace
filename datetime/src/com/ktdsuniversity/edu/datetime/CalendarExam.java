package com.ktdsuniversity.edu.datetime;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

	/**
	 * 현재 시간을 출력 Calendar 인스턴스 출력
	 */
	public static void printNow() {
		// Calendar는 Singleton Instance라서 getInstance() 메소드를 통해 가져와야 한다.
		// 아래 코드가 실행되는 순간의 pc 시간을 가져옴
		Calendar now = Calendar.getInstance();
		System.out.println(now);
	}

	/**
	 * 컴퓨터가 처음 개발된 1970년 1월 1일 00시 00분 00초 부터 현재까지 흐른 시간 1초 = 1000ms
	 */
	public static void printMilliSeconds() {
		long ms = System.currentTimeMillis();
		System.out.println(ms);
	}

	public static void printNowUseDate() {

		// 밀리세컨즈를 사용하는 이유
		// 메소드가 실행된 시간을 구할 때만 ms 가 사용됨
		// 예를들어, 게시글을 등록하는데 걸린 시간 0.012ms 소요됨

		long ms = System.currentTimeMillis();
		// java.utill.Date
		Date now = new Date(ms);
		System.out.println(now);
	}

	public static void printYearMonthDate() {

		// 1. Calendar 인스턴스 가져오기
		Calendar now = Calendar.getInstance();
		// 2. 연도 가져오기
		int year = now.get(Calendar.YEAR);
		// 3. 월 가져오기
		int month = now.get(Calendar.MONTH) + 1;
		// 4. 일 가져오기
		int day = now.get(Calendar.DAY_OF_MONTH);
		// 5. 출력하기
		System.out.println(year);
		System.out.println(month);
		System.out.println(day);

	}

	public static void printMinuteSeconds() {

		// 1. Calendar 인스턴스 가져오기
		Calendar now = Calendar.getInstance();
		// 2. 시 가져오기
		int hour = now.get(Calendar.HOUR);
		// 3. 분 가져오기
		int minute = now.get(Calendar.MINUTE);
		// 4. 초 가져오기
		int second = now.get(Calendar.SECOND);
		// 5. 출력하기
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);
	}

	public static void printWeekday() {

		// 1. Calendar 인스턴스 가져오기
		Calendar now = Calendar.getInstance();
		// 2. 현재 요일 가져오기 (1~7 = 일~토)
		int week = now.get(Calendar.DAY_OF_WEEK);
		// 3. 출력하기(숫자)
		System.out.println(week);

	}

	public static void printWeekdayString() {
		String[] weekdays = { "일", "월", "화", "수", "목", "금", "토" };

		// 1. Calendar 인스턴스 가져오기
		Calendar now = Calendar.getInstance();
		// 2. 현재 요일 가져오기(1~7 = 일~토)
		int week = now.get(Calendar.DAY_OF_WEEK);
		// 3. 출력하기(요일로 출력)
		System.out.println(weekdays[week - 1]);
	}

	public static void printFormattedDateTime() {

		// 1. Calendar 인스턴스 가져오기
		Calendar now = Calendar.getInstance();
		// 2. 날짜 포메터 생성 - 정해진 규칙
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// 3. 날짜 포메터를 이용해서 날짜 만들기
		String dateString = sdf.format(now.getTime());
		// 4. 출력
		System.out.println(dateString);

	}

	public static void printFormattedDate() {
		// 연 월 일 출력
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yy-LLL-dd");
		String dateString = sdf.format(now.getTime());
		System.out.println(dateString);

	}

	public static void printFormattedTime() {
		// 시 분 초 출력
		Calendar now = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("a K:m:s");
		String dateString = sdf.format(now.getTime());
		System.out.println(dateString);
	}

	public static void printAfterDay(int amount) {
		// 1. Calendar 인스턴스 가져오기
		Calendar now = Calendar.getInstance();
		// 2. Calendar 인스턴스에 하루 더하기
		now.add(Calendar.DAY_OF_MONTH, amount);
		// 3. SimpleDateFormat으로 출력하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-M-d");
		String formattedDate = sdf.format(now.getTime());
		System.out.println(formattedDate);

	}

	public static void printBeforeDay(int amount) {
		// 1. Calendar 인스턴스 가져오기
		Calendar now = Calendar.getInstance();
		// 2. Calendar 인스턴스에 하루 빼기
		now.add(Calendar.DAY_OF_MONTH, amount > 0 ? -amount : amount);
		// 3. SimpleDateFormat으로 출력하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = sdf.format(now.getTime());
		System.out.println(formattedDate);
	}

	public static void printAfterMonth(int amount) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MONTH, amount);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedMonth = sdf.format(now.getTime());
		System.out.println(formattedMonth);
	}

	public static void printBeforeMonth(int amount) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.MONTH, amount > 0 ? -amount : amount);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedMonth = sdf.format(now.getTime());
		System.out.println(formattedMonth);

	}

	public static void printAfterYear(int amount) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.YEAR, amount);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedYear = sdf.format(now.getTime());
		System.out.println(formattedYear);

	}

	public static void printBeforeYear(int amount) {
		Calendar now = Calendar.getInstance();
		now.add(Calendar.YEAR, amount > 0 ? -amount : amount);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedYear = sdf.format(now.getTime());
		System.out.println(formattedYear);
	}

	public static void print(int year, int month, int date) {
		// calendar 인스턴스 가져오기
		Calendar calendar = Calendar.getInstance();
		// 2. 파라미터 변수들을 Calendar 인스턴스에 적용하기
		calendar.set(year, month - 1, date, 0, 0, 0);
		// 3. 포맷에 맞춰 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formattedDate = sdf.format(calendar.getTime());
		System.out.println(formattedDate);

	}

	public static void print(int year, int month, int date, int hour, int minute, int second) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, date, hour, minute, second);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formattedDate = sdf.format(calendar.getTime());
		System.out.println(formattedDate);
	}

	public static void print(String datetime) {

		String hintString = "2024년 08월 05일";
		String[] dateArray = hintString.split("[^0-9 ]");
		for (String date : dateArray) {
			System.out.println(date.trim());
		}
	}

	public static void printAllDays(int year, int month) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, 1);

		// 1. 해당 연월의 마지막 날짜가 언젠지 구한다.
		// 1-1. 월을 더해서 하루를 뺀다
//		calendar.add(Calendar.MONTH, 1);
		// calendar.add(Calendar.DAY_OF_MONTH, -1);

		// 1-2. 해당 월의 마지막 날짜를 구한다.
		int lastDay = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println(lastDay);

		// 2. 1일부터 마지막 날짜까지 반복하면서 모든 날짜를 출력한다.
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for (int i = 0; i < lastDay; i++) {
			String formattedDate = sdf.format(calendar.getTime());
			System.out.println(formattedDate);
			calendar.add(Calendar.DAY_OF_MONTH, 1);
		}
	}

	public static void printNextWorkingDay(int year, int month, int date) {
		// 1. Calendar 인스턴스 가져오기
		Calendar calendar = Calendar.getInstance();
		calendar.set(year, month - 1, date);

		// 2. 다음 영업일을 알기 위해서 일단 하루 더하기
		calendar.add(Calendar.DAY_OF_MONTH, 1);

		// 3. 하루를 더한 날짜가 영업일이 아니라면
		// 계속 하루 더하기
		while (true) {

			int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);

			if (dayOfWeek == 1 || dayOfWeek == 7) {
				calendar.add(Calendar.DAY_OF_MONTH, 1);
			} else {
				break;
			}

		}

		// 4. 출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String formattedDate = sdf.format(calendar.getTime());
		System.out.println(formattedDate);
	}

	public static void printNextBirthDay(int month, int date) {
		Calendar calendar = Calendar.getInstance();
		int dDay = 0;

		while (true) {
			int nowMonth = calendar.get(Calendar.MONTH) + 1;
			int nowDate = calendar.get(Calendar.DATE);

			if (nowMonth == month && nowDate == date) {
				break;
			} else {
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				dDay++;
			}
		}
		System.out.println(dDay);
	}

	public static void main(String[] args) {
		printNow();
		printMilliSeconds();
		printNowUseDate(); // Date 사용됨

		// Calendar 사용
		printYearMonthDate();

		printMinuteSeconds();
		printWeekday();

		printWeekdayString();

		printFormattedDateTime();
		printFormattedDate();

		printAfterDay(1);

		print(1, 1, 1);
		print(2024, 8, 5, 14, 9, 0);
		print("2024년 08월 05일");

		printAllDays(2024, 8);
		printNextWorkingDay(2024, 8, 10);

		printNextBirthDay(12, 11);
	}
}
