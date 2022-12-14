package com.basics.interfaces;

interface manufacturing {
	void made();
}

interface sales {
	void sold();
}

public class Product implements manufacturing, sales {

	public static void main(String[] args) {

		Product soap = new Product();
		soap.made();
		soap.sold();

	}

	@Override
	public void sold() {
		System.out.println("The product has been sold");

	}

	@Override
	public void made() {
		System.out.println("The product has been made");

	}

}
