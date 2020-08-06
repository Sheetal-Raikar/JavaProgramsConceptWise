package com.Sharath.ExceptionHandling;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Account {

	public Connection connectToDb() throws SQLException
	{
		String url="http://discounting.odessa.local/";
		String name="sheetal";
		String password="raikar";
		Connection c=DriverManager.getConnection(url, name, password);
				return c;
		
	}
	
	public void withDrawAmount()
	{
		
	}
}
