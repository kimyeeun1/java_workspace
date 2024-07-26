package com.ktdsuniversity.edu.extendsexam;

public class EV extends Vehicle {

	private int battery;

	public EV(String model, int battery) {
		super(model);
		this.battery = battery;

	}

	public void checkBattery() {
		super.getVehicle();
	}

	public int getBattery() {

		return battery;

	}

	@Override
	public void model() {

		super.model();

		System.out.println("배터리양: " + getBattery());

	}

}
