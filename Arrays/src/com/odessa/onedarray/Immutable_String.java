package com.odessa.onedarray;

import java.util.Scanner;

public class Immutable_String {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("enter your city");
		String s = scan.nextLine();
		String[] d = s.split("[.]");

		for (int i = 0; i < d.length; i++) {
			System.out.println(d[i]);
		}

	}

}
