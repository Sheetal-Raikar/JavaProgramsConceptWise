package com.sharath.strings;

import java.util.Scanner;

public class CaseStudy1 {

	public static void main(String[] args) {
         System.out.println("enter the sentence");
         Scanner scan = new Scanner(System.in);
         String line = scan.nextLine();
//         String[] s = line.split(" ");
//         System.out.println(s.length);
         int count=0;
      for(int i=0;i<line.length();i++)
      {
    	  
    	  if(line.charAt(i)==' ')
    		   count++;
      }
      System.out.println(count+1);
      System.out.println(line.charAt(line.length()));
      
      
	}

}
