package com.ktdsuniversity.edu.extendsexam;

public class Vehicle {

	private String model;

	public Vehicle(String model) {
		this.model = model;
	}

	public String getVehicle() {
		return model;
	}

	public void offEngine() {
		System.out.println(model + "시동 Off");
	}

	public void model() {
		System.out.println(model + "시동 On");
	}

}
