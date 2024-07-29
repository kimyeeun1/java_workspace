package com.ktdsuniversity.edu.exceptions.custom;

public class MemberRegister {

	public boolean regist(Member member) {

		// 입력값 검증
		if (member == null) {
			throw new EmptyRegistInfoException("가입정보가 없습니다.");
		}

		if (member.getUserId() == null) {
			throw new EmptyRegistInfoException("회원의 아이디는 필수 값입니다.");
		}

		if (member.getUserName() == null) {
			throw new EmptyRegistInfoException("회원의 이름은 필수 값입니다.");
		}

		if (member.getPassword() == null) {
			throw new EmptyRegistInfoException("비밀번호는 필수 값입니다.");
		}

		// TODO 회원가입 처리하기

		return true;
	}

}
