package com.odessa.onedarray;

public class Static_ex1 {

	public static void main(String[] args) {
		StaticExample s1 = new StaticExample("cutie");
		System.out.println(s1.getName());
		System.out.println(s1.getInstanceNum());

		StaticExample s2 = new StaticExample("muddu");
		System.out.println(s2.getName());
		System.out.println(StaticExample.getInstanceNum());
		System.out.println(s2.clue);

	}

}

class StaticExample {
	private String name;
	private static int instanceNum;
	public static int clue;

	public StaticExample(String name) {
		this.name = name;
		instanceNum++;
	}

	public String getName() {
		return name;
	}

	public static int getInstanceNum() {
		return instanceNum;
	}

}