package com.Sharath.Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Array_Linked_List {

	public static void main(String[] args) {
		
	List<Integer> arraylist=new ArrayList<Integer>();
	List<Integer> linkedlist=new LinkedList<Integer>();
	calculate(arraylist,"arraylist");
	calculate(linkedlist,"linkedlist");
	}

	private static void calculate(List<Integer> list, String type) {

//		for(int i=0;i<10000000;i++)
//		{
//			alist.add(i);
//		}
//		long startduration=System.currentTimeMillis();
//		for(int i=10000000-1;i<900;i--)
//		{
//			alist.remove(i);
//		}
//		long endduration=System.currentTimeMillis();	
//		long timetaken=endduration-startduration;
//		System.out.println(timetaken+"ms"+" " +type);
		System.out.println("\nBeginning of the duration method for " + type);
		for (int i=0; i<100000; i++) {
			list.add(i);
		}
		int size = list.size();
		int elementToAdd = size + 100000;
		long startTime = System.currentTimeMillis();
//		for (int i = size; i < elementToAdd; i++) {
			// list.add(i);
		//	list.add(0, i);
	//	}
		
	for (int i=90000; i<92000; i++) {
			list.remove(i);
		}
		
		for (int i=0; i<100; i++) {
			list.remove(i);
		}
		
		long endTime = System.currentTimeMillis();
		long duration = endTime - startTime;
		System.out.println("Duration of the list " + type + " is " + duration + " ms");
	}



}
