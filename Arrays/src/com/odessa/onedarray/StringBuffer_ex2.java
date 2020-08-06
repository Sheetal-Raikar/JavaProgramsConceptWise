package com.odessa.onedarray;

public class StringBuffer_ex2 {

	public static void main(String[] args) {
StringBuffer sb = new StringBuffer("malleshwaram");
sb.setLength(6);
System.out.println(sb);
StringBuffer sb1 = new StringBuffer();
System.out.println(sb1.capacity());
sb1.ensureCapacity(1000);  //to increase capacity dynamically
System.out.println(sb1.capacity());

	}

}
