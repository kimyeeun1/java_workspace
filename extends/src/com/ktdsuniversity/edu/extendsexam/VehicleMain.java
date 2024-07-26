package com.ktdsuniversity.edu.extendsexam;

public class VehicleMain {

	public static void startEngine(Vehicle vehicle) {
		vehicle.model();
	}

	public static void main(String[] args) {

		// Is a 관계
		// Sub class is a Super class

		Vehicle kona = new Vehicle("코나");
		Vehicle teslaModelX = new EV("테슬라모델 엑스", 45);
		Vehicle forche = new SportsCar("911");
		Vehicle batCar = new BatMobile("배트카");

		Vehicle kona2 = new Vehicle("코나");
		Vehicle teslaModelX2 = new EV("테슬라모델 엑스", 45);
		Vehicle forche2 = new SportsCar("911");
		Vehicle batCar2 = new BatMobile("배트카");

		startEngine(kona);
		startEngine(teslaModelX);
		startEngine(forche);
		startEngine(batCar);

		startEngine(kona2);
		startEngine(teslaModelX2);
		startEngine(forche2);
		startEngine(batCar2);

	}

}
