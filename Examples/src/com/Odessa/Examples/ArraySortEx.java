package com.Odessa.Examples;

import java.util.Arrays;

public class ArraySortEx {

	public static void main(String[] args) {
		int[] arr= {11,10,9,55,66,32,21};
		Arrays.sort(arr);
		System.out.println("String array output"+ Arrays.toString(arr));
		System.out.println("******************OR******************");
		System.out.println("Iterating an array using for loop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] arr1= {"aaa","fff","bbb"};
		
		
	}

}
