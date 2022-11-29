package com.basics.functionalinterface;

import java.util.function.Supplier;

//public class SupplierDemo implements Supplier<String> {
//
//	@Override
//	public String get() {	
//		return "Hello World!";
//	}
//	
//	public static void main(String[] args) {
//		
//		Supplier<String> supplier = new SupplierDemo();
//		System.out.println(supplier.get());
//	}
//
//}

public class SupplierDemo{
	
	public static void main(String[] args) {
		
		Supplier<String> supplier = () -> "Hello World!";
		
		System.out.println(supplier.get());
		
		
	}
}