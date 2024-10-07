package com.demo.DI;

public class Dependency_Injection {

	// Teacher class (Dependency)
	static class Teacher {
		private String name;

		public Teacher(String name) {
			this.name = name;
		}

		public void teach(String subject) {
			System.out.println(name + " is teaching " + subject);
		}
	}

	// Student class (Dependent)
	static class Student {
		private String name;
		private final Teacher teacher; // Dependency

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

	public static void main(String[] args) {
		// Create the Teacher instance (dependency)
		Teacher teacher = new Teacher("Mayuri");

		// Inject the Teacher dependency into the Student using Constructor Injection
		Student student = new Student("Ruben", teacher);

		// The student studies a subject, and the teacher provides instruction
		student.study("Mathematics");
	}
}
