package com.ktdsuniversity.edu.collection.first;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListExam {

	private static void makeLotto() {
		List<Integer> lottoList = new ArrayList<>();
		Random random = new Random();

		// 로또 번호는 6개
		// lottoList에 엘리먼트가 6개가 다 찰 때까지 반복하자
		// lottoList에 엘리먼트가 언제 6개가 다 차는가? => 중복 여부 때문에 모른다
		while (lottoList.size() < 6) {
			// 중복 되지 않은 숫자만 리스트에 넣어준다

			// 중복되지 않는지 검사 필요 =>> 리스트에 난수가 포함되어 있는가? --> contains --> 이 결과가 true 라면 중복된 숫자
			// contains 값이 false라면 중복되지 않는 숫자 ---> lottoList에 넣는다

			int randomNumber = random.nextInt(45) + 1;

			boolean lottoNumber = lottoList.contains(randomNumber);

			if (!lottoNumber) {
				lottoList.add(randomNumber);
			}

			// FIXME 중복검사 해보자 -> 중복됏으면 넣어주지 않는다 --> 중복 안됐으면 숫자를 넣는다

		}

		// FIXME 리스트의 항목을 모두 출력해보자 --> for-each 사용
		for (int eachNumber : lottoList) {
			System.out.println(eachNumber);
		}
	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList();

		list.add(100); // index[0]
		list.add(90); // index[1]
		list.add(80); // index[2]
		list.add(70); // index[3]

		System.out.println(list);

		int number = list.get(0);
		System.out.println(number);
		number = list.get(1);
		System.out.println(number);
		number = list.get(2);
		System.out.println(number);
		number = list.get(3);
		System.out.println(number);
		/*
		 * number = list.get(4); System.out.println(number); // ===>
		 * IndexOutOfBoundsException 오류 발생
		 */

		System.out.println("========================================");

		// transitional for
		for (int i = 0; i < list.size(); i++) {
			int eachNumber = list.get(i);
			System.out.println(eachNumber);
		}

		System.out.println("========================================");

		// for-each
		for (int eachNumber : list) {
			System.out.println(eachNumber);
		}

		System.out.println("========================================");

		System.out.println("forEach Lambda");
		// forEach Lambda
		list.forEach(System.out::println);

		// 삭제
		// 0 1 2 3 인덱스를 가지고 있는 리스트에서 0 인덱스를 제거할 경우
		// 결과는 0 1 2 인덱스가 된다
		/*
		 * index | value 0 100 1 90 2 80 3 70
		 * 
		 * 0 인덱스 제거 후 index | value 0 90 1 80 2 70
		 */

		list.remove(0);
		// list.remove(1);
		// list.remove(2); // => IndexOutOfBoundsException 오류 발생
		// list.remove(3); // => IndexOutOfBoundsException 오류 발생

		// index에 할당된 값을 교체
		list.set(0, 110);
		System.out.println("0번 인덱스 제거 후 0번 인덱스의 값을 110으로 교체");
		for (int eachNumber : list) {
			System.out.println(eachNumber);
		}

		// 0번 110
		// 1번 80
		// 2번 70
		// 90 이라는 숫자가 리스트에 있는지 검증
		boolean isExists90 = list.contains(90);
		System.out.println(isExists90);

		// 90이라는 숫자 추가해서 검증
		list.add(90);
		isExists90 = list.contains(90);
		System.out.println(isExists90);

		// 리스트 복사
		// list 인스턴스를 list2 인스턴스로 복사

		// 1. memory copy : 메모리 주소를 그대로 할당
		List<Integer> list2 = list; // 메모리 주소가 같음

		list.add(100); // list2에도 100이 마지막에 추가

		System.out.println("메모리 복사 후 출력");
		for (int eachNumber : list2) {
			System.out.println(eachNumber);
		}

		// 2.element copy
		list2 = new ArrayList<>();
		list2.addAll(list); // 리스트의 메모리 참조 공유가 끊어짐
		list.add(200); // list2에 추가가 되지 않음

		System.out.println("엘리먼트 복사 후 출력");
		for (int eachNumber : list2) {
			System.out.println(eachNumber);
		}

		// 리스트 엘리먼트 모두 제거
		list.clear();
		list2.clear();

		System.out.println("list 인스턴스의 엘리먼트 개수: " + list.size());
		System.out.println("list2 인스턴스의 엘리먼트 개수: " + list2.size());

		makeLotto();
	}

}
