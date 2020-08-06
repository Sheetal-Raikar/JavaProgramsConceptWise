package com.odessa.onedarray;

public class String_ex3 {

	public static void main(String[] args) {
		byte[] b = { 97, 98, 99 };
		String s = new String(b);
		System.out.println(s);// abc
		String s1 = "Sheetal";
		System.out.println(s1.charAt(5));// a
		String s2 = "Java";
//s2=s2.concat("Software");
//s2=s2+"software";
		s2 += "software";
		System.out.println(s2);
		String s3 = "SHEETAL";
		System.out.println(s3.equals("sheetal"));// false
		System.out.println(s3.equalsIgnoreCase("sheetal"));// true
		String s4 = "";
		System.out.println(s4.isEmpty());// true
		String s5 = "hey";
		System.out.println(s5.isEmpty());// false
		System.out.println(s5.length()); // 3
		String s6 = "ababab";
		System.out.println(s6.replace('a', 'b'));// bbbbbb every a is replaced with b
		String s7 = "Samyukta";
		System.out.println(s7.substring(3));// yukta
		System.out.println(s7.substring(3, 6));// yuk ....3 to 5 only 3 inclusive 6 exclusive
		System.out.println(s7.indexOf('y'));// 3
		System.out.println(s7.indexOf('z'));// -1
		System.out.println(s3.indexOf('E'));// 2
		System.out.println(s3.lastIndexOf('E'));// 3
		System.out.println(s3.toLowerCase());// sheetal
		System.out.println(s7.toUpperCase());// SAMYUKTA
	}

}
