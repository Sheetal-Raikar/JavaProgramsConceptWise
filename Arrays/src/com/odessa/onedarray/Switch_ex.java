package com.odessa.onedarray;

import java.util.Scanner;

public class Switch_ex {

	public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.println("enter year");
int year=scan.nextInt();
System.out.println("enter month");
int month=scan.nextInt();
switch (month) {
case 1:
	//if(month==1|month==3|month==5|month==7|month==8|month==10|month==12)
	System.out.println("No of days is 31");
	break;
case 2:
	if(month==2 && year%400==0)
	System.out.println("No of days is 28");
	else
		System.out.println("No of days is 29");
	break;
case 3:
//	if(month==4|month==6|month==9|month==11)
		System.out.println("No of days is 31");
		break;
case 4:
		System.out.println("No of days is 30");
		break;		
case 5:
	System.out.println("No of days is 31");
	break;	
case 6:
	System.out.println("No of days is 30");
	break;	
case 7:
	System.out.println("No of days is 31");
	break;	
case 8:
	System.out.println("No of days is 31");
	break;	
case 9:
	System.out.println("No of days is 30");
	break;	
case 10:
	System.out.println("No of days is 31");
	break;	
case 11:
	System.out.println("No of days is 30");
	break;	
case 12:
	System.out.println("No of days is 31");
	break;	
	
default:
	System.out.println("invalid");
	break;
}

	}

}
