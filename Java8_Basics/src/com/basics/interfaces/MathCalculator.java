package com.basics.interfaces;

interface Calculator{
	static Integer add(Integer x,Integer y) {return x+y;}
	static Integer sub(Integer x,Integer y) {return x-y;}
	static Integer mul(Integer x,Integer y) {return x*y;}
	static Integer div(Integer x,Integer y) {return x/y;}
	void add();
	void sub();
	void mul();
	void div();
}
public class MathCalculator {

	public static void main(String[] args) {
		
		Calculator a = new Calc();
		a.add();
		System.out.println(Calculator.add(100, 50));
		
		Calculator s = new Calc();
		s.sub();
		System.out.println(Calculator.add(100, 50));
		
		Calculator m = new Calc();
		m.mul();
		System.out.println(Calculator.add(100, 50));
		
		Calculator d = new Calc();
		d.div();
		System.out.println(Calculator.add(100, 50));
	}

}

class Calc implements Calculator{

	@Override
	public void add() {
		System.out.println("Addition : ");
		
	}

	@Override
	public void sub() {
		System.out.println("Substraction : ");
		
	}

	@Override
	public void mul() {
		System.out.println("Multiplication : ");
		
	}

	@Override
	public void div() {
		System.out.println("Division : ");
		
	}
	
}
