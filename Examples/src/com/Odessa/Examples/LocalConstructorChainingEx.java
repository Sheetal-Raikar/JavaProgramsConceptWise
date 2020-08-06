package com.Odessa.Examples;

public class LocalConstructorChainingEx {
public LocalConstructorChainingEx()
{
	this(10);
	System.out.println("Zero Param Constructor");
}
public LocalConstructorChainingEx(int a)
{
	this(10,20);
	System.out.println("One Param Constructor");
}
public LocalConstructorChainingEx(int a,int b)
{
	System.out.println("Two Param Constructor");
}
}
