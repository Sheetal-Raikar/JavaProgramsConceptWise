package com.Odessa.Multithreading;

import java.util.Scanner;

public class SingleThreadedApproach {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws InterruptedException {
		Thread t = Thread.currentThread();
		System.out.println(t);
		System.out.println("Banking activity started");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the acc number");
		int accNo = scan.nextInt();
		System.out.println("enter password");
		int pwd = scan.nextInt();
		
		Thread.sleep(5000);
		System.out.println("collect your money");
		System.out.println("banking activity completed");
		System.out.println("printing number from 1 to 5");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			Thread.sleep(5000);
		}
		System.out.println("numbers printing activity completed");
		System.out.println("printing characters");
		for (int i = 65; i <= 70; i++) {
			System.out.println((char)i);
			Thread.sleep(5000);
		}
		System.out.println("character activity completed");
		scan.close();
	}

}
