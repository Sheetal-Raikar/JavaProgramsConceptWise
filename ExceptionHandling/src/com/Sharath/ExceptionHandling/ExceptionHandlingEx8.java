package com.Sharath.ExceptionHandling;

public class ExceptionHandlingEx8 {

	public static void main(String[] args) {
//Bank bank = new Bank();
//bank.initiate();

		Atm atm = new Atm();
		try {
			atm.inputData();
		} catch (Exception e) {
			try {
				atm.inputData();
			} catch (Exception b) {
				try {
					atm.inputData();
				} catch (Exception c) {

				}
			}
		}
	}

}
