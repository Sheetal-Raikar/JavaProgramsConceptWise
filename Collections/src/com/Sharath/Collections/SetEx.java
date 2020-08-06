package com.Sharath.Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<String> set= new HashSet<String>();

set.add("Audi");
set.add("BMW");
set.add("Honda");
set.add("Honda");
System.out.println(set);
for(String items: set)
{
	System.out.println(items);
}

Set<String> lset= new LinkedHashSet<String>();

lset.add("BMW");
lset.add("Audi");
lset.add("Honda");
lset.add("Honda");
System.out.println("Linked");
for(String items: lset)
{
	System.out.println(items);
}

Set<String> tset= new TreeSet<String>();

tset.add("Honda");
tset.add("Audi");
tset.add("BMW");
System.out.println("Tree");
for(String items: tset)
{
	System.out.println(items);
}
	}

}
