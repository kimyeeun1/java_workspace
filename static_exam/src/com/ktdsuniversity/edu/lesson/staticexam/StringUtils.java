package com.ktdsuniversity.edu.lesson.staticexam;

public class StringUtils {
	/**
	 * 파라미터 str의 값이 비어있는지 검사
	 * 
	 * @param str 검사하고자 하는 문자열
	 * @return str이 null이거나 빈 문자열이라면 true
	 */
	public static boolean isEmpty(String str) {

		return str == null || str.equals("");

	}

	/**
	 * 파라미터 str 값이 숫자로만 구성되어있는지 검사
	 * 
	 * @param str 검사하고자 하는 문자열
	 * @return str이 0부터 9로 구성된 숫자로만 이루어져 있다면 true
	 */
	public static boolean isNumber(String str) {

		return str.matches("^[0-9]+$");

	}

	/**
	 * 숫자로만 이루어진 문자열을 숫자로 변경시킨다.
	 * 
	 * @param str 숫자로 변경시킬 문자열
	 * @return str을 숫자로 변경시킨 결과
	 */
	public static int parseInt(String str) {

		return Integer.parseInt(str);

	}
}
