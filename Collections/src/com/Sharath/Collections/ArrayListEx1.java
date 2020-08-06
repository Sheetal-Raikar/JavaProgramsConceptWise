package com.Sharath.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

class Student {
	int rollNo;
	String name;
	String dob;
	String gender;

	public Student(int rollNo, String name, String dob, String gender) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.dob = dob;
		this.gender = gender;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", dob=" + dob + ", gender=" + gender + "]";
	}

	
}

public class ArrayListEx1 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "sharath", "22-22-2018", "male");
		System.out.println(s1.toString());

		List<Student> al = new ArrayList<>();

//		al.add(10);
//		al.add(10);
//		al.add(2.4);
//		al.add(true);
//		al.add("sharath");
//		al.add('S');
		al.add(s1);
		al.clear();
		System.out.println("list" + al);

		al.removeAll(al);
		System.out.println(al);

		PriorityQueue<Object> queue = new PriorityQueue<>();
		queue.add(10);
		queue.add(10);

		System.out.println("queue" + queue);

		Set<Object> set = new HashSet<>();
		set.add(10);
		set.add("sharath");
		System.out.println(set.add(10));
		System.out.println("set" + set);
		

	}

}
