package com.Sharath.ExceptionHandling;

import java.sql.SQLException;

public class ExceptionHandlingEx2 {

	public static void main(String[] args)  {
Account a = new Account();

try {
	System.out.println("first line of try block");
	a.connectToDb();
	System.out.println("after the connectToDb method");
} 
catch (SQLException e) {
	// TODO Auto-generated catch block
	//e.printStackTrace();
	System.out.println(e.getMessage());
	//System.out.println("try again");
}
//a.withDrawAmount();
finally
{
	System.out.println("finally block");
}
	}

}
