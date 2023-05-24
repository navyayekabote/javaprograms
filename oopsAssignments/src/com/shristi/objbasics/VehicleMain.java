package com.shristi.objbasics;

public class VehicleMain {

	public static void main(String[] args) {
		Vehicle vehicle=new Vehicle("A3",400000,"Audi");
		Vehicle vehicle1=new Vehicle("Armada",600000,"Nissan");
		vehicle.getDetails();
		vehicle1.getDetails();

	}

}
