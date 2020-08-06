package com.sharath.strings;

import java.util.Scanner;

public class CaseStudy5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the student name");
		String name =s.nextLine();
		System.out.println("enter marks");
		int marks=s.nextInt();
FindGrade f1 = new FindGrade(name,marks);
f1.FindingGrade();
	}

}
class FindGrade
{
	String name;
	int marks;
	char grade;
	FindGrade(String name,int marks)
	{
		this.name=name;
		this.marks=marks;
	}
	public void FindingGrade()
	{
		if(marks>=90 & marks<100) 
		{
		grade='A';
		}
		else if(marks<90 & marks>=70)
		{
			grade='B';
		}
		else if(marks<70 & marks>=35)
		{
			grade='C';
		}
		else
		{
			grade='D';
		}
		System.out.println("Grade for student " +name+" is "+grade);
	}
}
