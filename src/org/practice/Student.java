package org.practice;
public class Student extends Detail {
	public Student(String name) {
		this(123);
		System.out.println("Student Name :"+name);
	}
public Student(int ug) {

	System.out.println("UG pass out :"+ug);
}
public Student() {
	this("Arun Kumar");
	System.out.println("PG pass out : 2022 ");
}
public static void main(String[] args) {
	Student s = new Student();
}
}
