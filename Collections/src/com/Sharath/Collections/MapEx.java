package com.Sharath.Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<Integer,String> map=new HashMap<Integer,String>();
map.put(1, "BMW");
map.put(5, "Honda");
map.put(3, "Audi");

String value1=map.get(2);
System.out.println(value1);
map.put(3, "sheetal");
System.out.println(map.get(3));
for(Map.Entry<Integer, String> items: map.entrySet())
{
	String Value=items.getValue();
	int key=items.getKey();
	System.out.println(key+""+Value);
	
}
for(Integer key: map.keySet())
{
	String Value=map.get(key);
System.out.println(key+""+Value);
}
Map<Integer,String> linkedMap=new LinkedHashMap<Integer,String>();
Map<Integer,String> treeMap=new HashMap<Integer,String>();

	}

}
