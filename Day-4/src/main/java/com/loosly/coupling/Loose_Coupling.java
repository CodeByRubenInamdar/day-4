package com.loosly.coupling;

// Step 1: Define the Teacher Interface
interface Teacher {
	void teach(String subject);
}

// Step 2: Implement the Teacher Interface
class MathTeacher implements Teacher {
	@Override
	public void teach(String subject) {
		System.out.println("Math Teacher is teaching " + subject);
	}
}

class ScienceTeacher implements Teacher {
	@Override
	public void teach(String subject) {
		System.out.println("Science Teacher is teaching " + subject);
	}
}

// Step 3: Student class that uses the Teacher interface
class Student {
	private String name;
	private Teacher teacher; // Dependency

	// Constructor Injection for Teacher dependency
	public Student(String name, Teacher teacher) {
		this.name = name;
		this.teacher = teacher; // Injecting the Teacher dependency
	}

	public void study(String subject) {
		System.out.println(name + " is studying.");
		teacher.teach(subject); // Using the injected Teacher
	}
}

public class Loose_Coupling {

	public static void main(String[] args) {
		// Injecting MathTeacher
		Teacher mathTeacher = new MathTeacher();
		Student student1 = new Student("Joshi", mathTeacher);
		student1.study("C Lang");

		// Injecting ScienceTeacher
		Teacher scienceTeacher = new ScienceTeacher();
		Student student2 = new Student("Vipul", scienceTeacher);
		student2.study("Java");
	}
}
