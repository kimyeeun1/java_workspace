package com.ktdsuniversity.edu.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExam {

	public static void printNowDate() {
		// 날짜만 가져오는 기능
		LocalDate now = LocalDate.now();

		// 시간만 가져오는 기능: LocalTime

		// 날짜와 시간을 모두 가져오는 기능: LocalDateTime

		System.out.println(now); // -> 2024-08-06
		// 기본 날짜 형식을 원하지 않을 경우 사용
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
		String formattedDate = dtf.format(now);
		System.out.println(formattedDate);
	}

	public static void printNowTime() {
		LocalTime now = LocalTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("a h시 mm분 ss초");
		String formattedDate = dtf.format(now);
		System.out.println(formattedDate);
	}

	public static void printNowDateTime() {
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a h시 mm분 ss초");
		String formattedDate = dtf.format(now);
		System.out.println(formattedDate);
	}

	public static void printResultAddDate() {
		// LocalDate에 날짜를 더하기
		LocalDate date = LocalDate.of(2024, 8, 6);
		System.out.println("before: " + date);
		System.out.println("after: " + date);
		date = date.plusDays(4);
		date = date.plusMonths(4);
		date = date.plusYears(4);
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		System.out.println("after: " + date);
		System.out.println(dayOfWeek);
	}

	public static void printResultMinusDate() {
		// 2024년 10월 16일 LocalDate를 만들어서
		LocalDate date = LocalDate.of(2024, 10, 16);
		// 4년 8개월 12일 뺀 결과를 출력
		date = date.minusDays(12);
		date = date.minusMonths(8);
		date = date.minusYears(4);
		System.out.println(date);
	}

	public static void printNowDayOfWeek() {
		LocalDate now = LocalDate.now();

		DayOfWeek dayOfWeek = now.getDayOfWeek();

		System.out.println(dayOfWeek);
	}

	public static void printResultAddTime() {
		// LocalTime
		LocalTime time = LocalTime.of(10, 9);
		time = time.plusHours(1);
		time = time.plusMinutes(10);
		System.out.println(time);
	}

	public static void printResultMinusTime() {
		// LocalTime
		LocalTime time = LocalTime.now();
		time = time.minusHours(1);
		time = time.minusMinutes(10);
		System.out.println(time);

	}

	public static void printResultAddDateTime() {
		// LocalDateTime
		LocalDateTime dateTime = LocalDateTime.now();
		dateTime = dateTime.plusHours(5);
		dateTime = dateTime.plusMinutes(10);
		dateTime = dateTime.plusMonths(9);
		dateTime = dateTime.plusDays(9);
		System.out.println(dateTime);

	}

	public static void printResultMinusDateTime() {
		// LocalDateTime
		LocalDateTime dateTime = LocalDateTime.of(2024, 8, 6, 10, 15);
		dateTime = dateTime.minusYears(4);
		dateTime = dateTime.minusMonths(3);
		System.out.println(dateTime);
	}

	public static void printNextWorkingDay() {
		// LocalDate를 이용해 현재 날짜로부터 다음 6영업일 이후의 날짜를 구하세요.
		LocalDate date = LocalDate.now();
		int count = 0;
		while (true) {
			date = date.plusDays(1);
			DayOfWeek dayOfWeek = date.getDayOfWeek();
			if (dayOfWeek != DayOfWeek.SUNDAY && dayOfWeek != DayOfWeek.SATURDAY) {
				count++;
			}
			if (count == 6) {
				break;
			}

		}
		System.out.println(date);
	}

	public static void printCorrectDatePeriod() {
		// 올바른 기간 검색 파라미터인가?

		LocalDate from = LocalDate.of(2024, 12, 31);
		LocalDate to = LocalDate.of(2024, 12, 31);

		// from이 to 보다 같거나 과거인가?
		boolean isCorrectDatePeriod = from.isBefore(to) || from.isEqual(to);
		System.out.println(isCorrectDatePeriod);
	}

	public static void printBetween() {

		LocalDate startDate = LocalDate.of(2020, 1, 13);
		LocalDate endDate = LocalDate.of(2024, 8, 6);

		// startDate와 endDate의 차이는?
		Period between = Period.between(startDate, endDate);
		System.out.println(between);

		int years = between.getYears();
		int months = between.getMonths();
		int days = between.getDays();
		System.out.println(years + "년 " + months + "개월 " + days + "일 차이가 있습니다.");
	}

	public static void main(String[] args) {

		printNowDate();
		printNowTime();
		printNowDateTime();
		printResultAddDate();
		printResultMinusDate();
		printNowDayOfWeek();
		printResultAddTime();
		printResultMinusTime();
		printResultAddDateTime();
		printResultMinusDateTime();
		printNextWorkingDay();
		printCorrectDatePeriod();
		printBetween();

	}
}
