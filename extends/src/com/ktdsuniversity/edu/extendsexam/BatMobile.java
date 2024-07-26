package com.ktdsuniversity.edu.extendsexam;

public class BatMobile extends SportsCar {

	public BatMobile(String model) {

		super(model);

	}

	public void batMobileMode() {

		String model = super.getVehicle();
		System.out.println(model + "배트포트 분리합니다.");

	}

	@Override
	public void model() {
		// TODO Auto-generated method stub
		super.model();
		batMobileMode();

	}

}
