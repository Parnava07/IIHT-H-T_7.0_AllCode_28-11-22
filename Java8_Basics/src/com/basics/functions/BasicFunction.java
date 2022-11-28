package com.basics.functions;

public class BasicFunction {

	public static void main(String[] args) {
		System.out.println(Addition(12, 23));
		System.out.println(Substraction(35, 12));
		System.out.println(Multiplication(2, 8));
		System.out.println(Division(30, 3));
		System.out.println(Square(12));
		System.out.println(Cube(9));
	}

	static Integer Addition(Integer num1, Integer num2) {
		return num1 + num2;
	}

	static Integer Substraction(Integer num1, Integer num2) {
		return num1 - num2;
	}

	static Integer Multiplication(Integer num1, Integer num2) {
		return num1 * num2;
	}

	static Integer Division(Integer num1, Integer num2) {
		return num1 / num2;
	}

	static Integer Square(Integer num1) {
		return num1 * num1;
	}

	static Integer Cube(Integer num1) {
		return num1 * num1 * num1;
	}

}