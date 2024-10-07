package com.demo.CI;

public class Constructor_Injection {

	// Teacher class (Dependency)
	static class Teacher {
		private String name;

		public Teacher(String name) {
			this.name = name;
		}

		public void guideStudent(String studentName) {
			System.out.println("Teacher " + name + " is guiding student " + studentName);
		}
	}

	// Student class (Dependent Class)
	static class Student {
		private String name;
		private final Teacher teacher; // Dependency

		// Constructor Injection
		public Student(String name, Teacher teacher) {
			this.name = name;
			this.teacher = teacher; // Injecting the Teacher dependency
		}

		public void attendClass() {
			System.out.println("Student " + name + " is attending class.");
			teacher.guideStudent(name); // Using the injected Teacher
		}
	}

	public static void main(String[] args) {
		// Create the Teacher instance (dependency)
		Teacher teacher = new Teacher("Vipul");

		// Inject the Teacher dependency into the Student using Constructor Injection
		Student student = new Student("Ruben", teacher);

		// The student attends class, and the teacher provides guidance
		student.attendClass();
	}
}
