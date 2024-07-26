package com.ktdsuniversity.edu.extendsexam;

public class SportsCar extends Vehicle {

	public SportsCar(String model) {

		super(model);

	}

	public void turboMode() {

		String model = super.getVehicle();
		System.out.println(model + "터보 엔진을 시작합니다.");

	}

	@Override
	public void model() {
		// TODO Auto-generated method stub
		super.model();
		turboMode();

	}

}
