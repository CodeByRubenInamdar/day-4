package com.titghtly_coupling;

// Teacher class
class Teacher {
	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	public void teach(String subject) {
		System.out.println(name + " is teaching " + subject);
	}
}

// Student class
class Student {
	private String name;
	private Teacher teacher; // Dependency

	public Student(String name) {
		this.name = name;
		this.teacher = new Teacher("Mr. Smith"); // Directly creating Teacher instance
	}

	public void study(String subject) {
		System.out.println(name + " is studying.");
		teacher.teach(subject); // Using the tightly coupled Teacher
	}
}

// Main application
public class Tightly_Copuling {
	public static void main(String[] args) {
		Student student1 = new Student("Vipul");
		student1.study("Core Java");

		Student student2 = new Student("hemangi");
		student2.study("Adv. Java");
	}
}
