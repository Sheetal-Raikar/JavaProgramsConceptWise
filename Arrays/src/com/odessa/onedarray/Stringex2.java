package com.odessa.onedarray;

public class Stringex2 {

	public static String mask(String creditCard)
	{
		String x="XXXX_XXXX_XXXX_";
		return x+creditCard.substring(15, 19);
		
		
	}
	public static void main(String[] args) {

		System.out.println(mask("1234_5678_9101_5676"));
	}

}
