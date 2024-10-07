package com.demo.SI;

public class Setter_Injection {

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

	// Student class (Dependent)
	static class Student {
		private String name;
		private Teacher teacher; // Dependency

		// Setter Injection for Teacher dependency
		public void setTeacher(Teacher teacher) {
			this.teacher = teacher;
		}

		public void setName(String name) {
			this.name = name;
		}

		public void attendClass() {
			System.out.println("Student " + name + " is attending class.");
			teacher.guideStudent(name); // Using the injected Teacher
		}
	}

	public static void main(String[] args) {
		// Create the Teacher instance (dependency)
		Teacher teacher = new Teacher("Shabham");

		// Create the Student instance (dependent)
		Student student = new Student();

		// Inject the Teacher dependency using setter method
		student.setTeacher(teacher);
		student.setName("Ruben");

		// The student attends class, and the teacher provides guidance
		student.attendClass();
	}
}
