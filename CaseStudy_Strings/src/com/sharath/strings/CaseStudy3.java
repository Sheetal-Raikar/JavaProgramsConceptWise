package com.sharath.strings;

import java.util.Scanner;

public class CaseStudy3 {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter the sentence");
String s1 = scan.nextLine();
int vowel_Count=0;
int consonant_Count=0;
int spaces=0;
for(int i=0;i<s1.length();i++)	
	{
	if(s1.charAt(i)=='a'|s1.charAt(i)=='e'|s1.charAt(i)=='i'|s1.charAt(i)=='o'|s1.charAt(i)=='u')
	{
		 vowel_Count=vowel_Count+1;
	//	 System.out.println(s1.charAt(i));
	}
	else if(s1.charAt(i)!='a'|s1.charAt(i)!='e'|s1.charAt(i)!='i'|s1.charAt(i)!='o'|s1.charAt(i)!='u'|s1.charAt(i)!=' ')
	{
		consonant_Count=consonant_Count+1;
	//	System.out.println(s1.charAt(i));
	}
	else 
	{
		spaces=spaces+1;
	//	System.out.println(s1.charAt(i));
	}
	}
System.out.println(vowel_Count);
System.out.println(consonant_Count);
System.out.println(spaces);

	}

}
