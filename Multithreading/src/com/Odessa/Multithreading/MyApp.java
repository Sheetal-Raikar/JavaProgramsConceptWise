package com.Odessa.Multithreading;

import java.util.Scanner;

public class MyApp {

	public static void main(String[] args) {
		Thread m =Thread.currentThread();
		System.out.println(m);
		m.setName("muddu");
		System.out.println(m);
		m.setPriority(10);
		Banking banking = new Banking();
		System.out.println(banking.getPriority());
		Numbers numbers = new Numbers();
		System.out.println(numbers.getPriority());
		Characters characters = new Characters();
		System.out.println(characters.getPriority());
		banking.start();
		numbers.start();
		characters.start();
	}

}

class Banking extends Thread {
	@Override
	public void run() {
		System.out.println("Banking activity started");
		Scanner scan = new Scanner(System.in);
		System.out.println("enter the acc number");
		int accNo = scan.nextInt();
		System.out.println("enter password");
		int pwd = scan.nextInt();

		try {
			Thread.sleep(50);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("collect your money");
		System.out.println("banking activity completed");
	}
}

class Numbers extends Thread {
	public void run() {
		System.out.println("printing number from 1 to 5");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("numbers printing activity completed");
	}
}

class Characters extends Thread {
	public void run() {
		System.out.println("printing characters");
		for (int i = 65; i <= 70; i++) {
			System.out.println((char) i);
			try {
				Thread.sleep((long) 0.25);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("character activity completed");
	}
}
