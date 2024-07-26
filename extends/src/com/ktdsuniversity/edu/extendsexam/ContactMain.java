package com.ktdsuniversity.edu.extendsexam;

public class ContactMain {

	public static void main(String[] args) {

		Contact[] contactArray = new Contact[5];
		contactArray[0] = new Contact("자바", "010-1234-1234");
		contactArray[1] = new Contact("김예", "010-5678-1234");
		contactArray[2] = new Contact("김은", "010-2345-6789");
		contactArray[3] = new Contact("예은", "010-8765-4321");
		contactArray[4] = new EmailContact("예은", "010-8765-4321", "kim@korea.com");

		for (int i = 0; i < contactArray.length; i++) {
			contactArray[i].printContact();
			contactArray[i].phoneCall();

			if (contactArray[i] instanceof EmailContact) { // EmailContact 클래스의 인스턴스인지 확인하는 함수(명시적 형변환(instanceof)
				// EmailContact is a Contact
				// Contact is not a EmailContact
				// is a 관계가 역전 되어 있을 경우 명시적 형변환 사용
				EmailContact emailContactInstance = (EmailContact) contactArray[i];
				emailContactInstance.sendEmail();
			}

		}

		/*
		 * Contact java = new Contact("자바", "010-1234-1234"); java.printContact();
		 * 
		 * Contact ye = new Contact("김예", "010-5678-1234"); ye.printContact();
		 */
	}
}
