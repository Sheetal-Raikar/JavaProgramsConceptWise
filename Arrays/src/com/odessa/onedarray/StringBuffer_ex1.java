package com.odessa.onedarray;

public class StringBuffer_ex1 {
public static void main(String[] args)
{
	StringBuffer sb = new StringBuffer();
	System.out.println(sb.capacity());//16
	sb.append("abcdefghijklmnop");
	System.out.println(sb.capacity());//16
	sb.append("q");
	System.out.println(sb.capacity());//34 ...trying to add 17th character
	StringBuffer sb1 = new StringBuffer("sheetal");
	System.out.println(sb1.capacity());//23
	StringBuffer sb2 = new StringBuffer("raikar");
	System.out.println(sb2.charAt(3)); //k
//	System.out.println(sb2.charAt(30)); //StringIndexOutOfBoundException
	sb2.setCharAt(3, 'm');
	System.out.println(sb2); //raikar is replaced with raimar
	StringBuffer sb3 = new StringBuffer();
	sb3.append("PI value is"); //to add/append a string at the end
	sb3.append(3.14);  //to append a value at the end
	sb3.append("it is exactly");
	sb3.append(true);
	System.out.println(sb3);
	StringBuffer sb4 = new StringBuffer("abcdefg");
	sb4.insert(2, "z"); //to insert a character at a given index
	System.out.println(sb4);
	sb4.insert(3, true); //to insert a boolean value at a given index
	System.out.println(sb4);
	sb4.delete(3, 7); //to delete characters from begin index to end-1 index  //begin inclusive...end exclusive
	System.out.println(sb4);
	sb4.deleteCharAt(7);// character at index 7 is deleted
	System.out.println(sb4);
	sb4.reverse();
	System.out.println(sb4);
	}
}

