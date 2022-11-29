package com.basics.cons;

public class ConsMain {
	public static void main(String[] args) {
		System.out.println("we are studying const ref");
		
		IStudent iStudent = () -> new Student();
//		{
//			return new Student();
//		};
		Student student = iStudent.getStudent();
		student.display("Sam", "10");
	}

}
