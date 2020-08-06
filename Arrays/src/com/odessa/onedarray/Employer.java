package com.odessa.onedarray;

import java.util.Scanner;

public class Employer {

	private static double gross_Sal;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("welcome to bank");
		System.out.println("the list of employess are" + "\n" + "1.Sharath" + "\n" + "2.Sheetal" + "\n" + "3.Akshay");
		int choice = scan.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the gross salary of Sharath");
			gross_Sal = scan.nextDouble();
			System.out.println("enter the HRA");
			double HRA = scan.nextDouble();
			System.out.println("enter the DA");
			double DA = scan.nextDouble();
			// Employee e1 = new Employee();
			System.out.println(Employee.Calculate(gross_Sal, HRA, DA));
			break;

		case 2:
			System.out.println("Enter the gross salary of Sheetal");
			gross_Sal = scan.nextDouble();
			System.out.println("enter the incentive");
			double incentive = scan.nextDouble();
			// Employee e2 = new Employee();
			System.out.println(Employee.Calculate(gross_Sal, incentive));
			break;
		}
	}

}

class Employee {
	private static double gross_sal;
	private static double HRA;
	private static double DA;
	private static double incentive;
	private static double salary;

	static double Calculate(double gross_sal, double HRA, double DA) {
		gross_sal = gross_sal;
		HRA = HRA;
		DA = DA;
		return gross_sal + HRA + DA;
	}

	static double Calculate(double gross_sal, double incentive) {
		gross_sal = gross_sal;
		incentive = incentive;
		return gross_sal + incentive;
	}

}
