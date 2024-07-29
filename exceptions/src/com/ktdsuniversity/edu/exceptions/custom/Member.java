package com.ktdsuniversity.edu.exceptions.custom;

public class Member {

	private String userId;

	private String userName;

	private String password;

	/*
	 * 생성자 자동 생성하기 Alt+Shift+S+O = > Alt + G
	 * 
	 * Getter /setter 자동생성 Alt + Shift + S + R -> Alt + A -> Alt + R
	 * 
	 */
	public Member(String userId, String userName, String password) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
