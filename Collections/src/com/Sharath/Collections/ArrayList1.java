package com.Sharath.Collections;

import java.util.ArrayList;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> cars=new ArrayList<>();
cars.add("bmw");
cars.add("audi");
cars.add("duster");
System.out.println(cars.get(0));

int size=cars.size();
System.out.println(size);

for(int i=0;i<size;i++)
{
	System.out.println(cars.get(i));
}
cars.remove(0);
for(String car:cars)
	System.out.println(car);

	}

}
