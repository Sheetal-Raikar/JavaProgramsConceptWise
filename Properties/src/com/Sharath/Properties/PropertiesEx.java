package com.Sharath.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx {

	public static void main(String[] args) throws IOException {
		String location="D:\\sharath\\Properties\\src\\com\\Sharath\\Properties\\test.properties";
		Properties properties = new Properties();
FileInputStream fileInputStream = new FileInputStream(location);
properties.load(fileInputStream);
System.out.println(properties.getProperty("name"));
System.out.println(properties.getProperty("lang"));
	}

}

//System.out.println(prop.getProperty("name"));
//System.out.println(prop.getProperty("course"));