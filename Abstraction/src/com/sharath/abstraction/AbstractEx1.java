package com.sharath.abstraction;

public class AbstractEx1 {

	public static void main(String[] args) {
CargoPlane c = new CargoPlane();
PassengerPlane p = new PassengerPlane();
Airport a =new Airport();
a.permit(c);
a.permit(p);

	}

}
