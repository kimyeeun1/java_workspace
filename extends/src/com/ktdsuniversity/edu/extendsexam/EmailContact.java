package com.ktdsuniversity.edu.extendsexam;

/**
 * 이름, 전화번호를 가지고 있는 연락처(Contact) 클래스를 확장한 클래스 이메일만 추가
 * 
 * 확장의 대상이 되는 클래스(Contact)에 생성자가 존재할 경우 확장을 하는 클래스(EmailContact)에서 반드시 해당 생성자를
 * 호출해줘야 한다.
 * 
 * 
 */
public class EmailContact extends Contact {

	/**
	 * 사용자의 요청으로 이메일 추가
	 */
	private String email;

	public EmailContact(String name, String phone, String email) {
		// super(); //super(): Contact 클래스의 기본 생성자를 호출
		super(name, phone); // public Contact(String name, String phone) {...} 호출
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}

	public void sendEmail() {
		System.out.println("이름: " + super.getName() + "에게 이메일을 보냅니다.");
	}

	@Override // 오버라이딩 했다는 표시
	public void printContact() {

		super.printContact();

		System.out.println("이메일: " + this.email);

	}
}
