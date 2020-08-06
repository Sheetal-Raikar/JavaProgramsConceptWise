package com.sharath.strings;

public class CaseStudy2 {

	public static void main(String[] args) {
		String s = new String("ABC");
//		StringBuffer s2 = new StringBuffer("sheetal");
//		StringBuffer r = s2.reverse();
//		System.out.println(r);
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
		{
			//System.out.println(s.charAt(i));
			temp=temp+s.charAt(i);
		}
		
		System.out.println(temp);

	}

}
