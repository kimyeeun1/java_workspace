package homework;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotePad {

	public static void main(String[] args) {

		Map<String, String> dictionary = new HashMap<String, String>();

		// 인삿말
		System.out.println("======================");
		System.out.println("       간단 단어장       ");
		System.out.println("======================");

		// 초기화 처리
		Scanner keyboard = new Scanner(System.in);
		int flag = 0; // 메뉴를 입력 받을 변수

		// 단어 저장용 변수의 선언과 초기화
		String english = "";
		String korean = "";

		// 프로그램의 메인 부분 처리
		while (true) {
			System.out.println("********메뉴를 선택하세요*******");
			System.out.println("1. 단어 등록");
			System.out.println("2. 단어 조회");
			System.out.println("3. 단어 삭제");
			System.out.println("9. 종료");

			// 메뉴를 입력 받음
			flag = keyboard.nextInt();

			// 1을 선택한 경우
			if (flag == 1) {
				System.out.println("등록하고 싶은 영어 단어를 입력하세요.");
				english = keyboard.next();
				System.out.println("등록한 영어의 뜻을 한국어로 입력하세요.");
				korean = keyboard.next();

				// Map에 단어를 등록함
				dictionary.put(english, korean);
				System.out.println("단어를 등록했습니다.");
			}

			// 2를 선택한 경우
			else if (flag == 2) {
				System.out.println("찾고 싶은 영어 단어를 입력하세요.");
				english = keyboard.next();

				// Map에서 단어를 가져옴
				korean = dictionary.get(english);
				if (korean == null) {
					System.out.println("해당 단어는 존재하지 않습니다.");
				} else {
					System.out.println(english + "의 뜻은 " + korean + "입니다.");
				}
			}

			// 3을 선택한 경우
			else if (flag == 3) {
				System.out.println("삭제하고 싶은 영어 단어를 입력하세요.");
				english = keyboard.next();

				// Map에서 단어를 가져옴
				korean = dictionary.get(english);
				if (korean == null) {
					System.out.println("해당 단어는 존재하지 않습니다.");
				} else {
					// Map에서 단어를 삭제함
					dictionary.remove(english);
					System.out.println(english + "를(을) 삭제했습니다.");
				}
			}

			// 9를 선택한 경우
			else if (flag == 9) {
				System.out.println("프로그램을 종료합니다.");
				System.exit(0);
			} else {
				System.out.println("숫자 1,2,3,9 중 하나를 입력하세요.");
			}
		}
	}// 메소드 선언 종료
}// 클래스 선언 종료
