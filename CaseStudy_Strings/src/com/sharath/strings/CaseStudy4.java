package com.sharath.strings;
//program to find the maximum occurring character in given String
import java.util.Scanner;

public class CaseStudy4 {

	static int count;
	public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("enter the word");
String s=sc.nextLine();
char[] ch=new char[s.length()];
for(int i=0;i<s.length();i++)
{
	for(int j=i+1;j<s.length();j++)
	{
		if(s.charAt(i)==s.charAt(j))
	 ch[i]=s.charAt(i);
	}
}
for(int i=0;i<s.length();i++)
{
System.out.println(ch[i]);
	}
	}

}
