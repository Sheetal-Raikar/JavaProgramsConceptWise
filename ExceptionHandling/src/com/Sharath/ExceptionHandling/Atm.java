package com.Sharath.ExceptionHandling;

import java.util.Scanner;

public class Atm {
	String name = "ABC";
	int password = 123;

	public void inputData() throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name");
		String sname = sc.nextLine();
		System.out.println("enter password");
		int spassword = sc.nextInt();
		if (name == sname && password == spassword) {
			System.out.println("success..take your amount");
		} else {
			CustomException customException = new CustomException();
			System.out.println(customException.getMessage());
			throw customException;
		}
	}

}
