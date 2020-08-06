package com.odessa.onedarray;

import java.util.Scanner;

class SavingAccount {

	private  double balance = 1000;
	private int PIN = 123;

	public SavingAccount(double balance, int pIN) {
		//super();
		if (PIN == pIN) {
			this.balance =this.balance+ balance;
			System.out.println("Amount deposited successfully");
		} else {
			System.out.println("wrong pin ..please try again");
		}
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = this.balance+balance;
	}

}

public class AccountApp {
	static double amount;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the amount to be deposited");
		amount = scan.nextDouble();
		System.out.println("Enter the PIN");
		int pin = scan.nextInt();
		SavingAccount account = new SavingAccount(amount, pin);

		System.out.println("the current balance is" + account.getBalance());
		System.out.println("if you want to deposit again..enter the amount");
		amount = scan.nextDouble();
		account.setBalance(amount);
		System.out.println("the current balance is" + account.getBalance());

	}

}

//once a value is set to the property of an object by using constructor...if a programmer has to modify the property then again he has 
//to create object by calling constructor
//the above problem can be overcome by using setters/mutators example is pin number