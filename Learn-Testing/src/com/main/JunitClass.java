package com.main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JunitClass {

	String userName = "Parnava07";

	@Test
	public void testUserName() {
		System.out.println("Testing if username matches");
		assertEquals("Parnava07", userName);

	}

	@Test
	public void junitMethod() {
		System.out.println("Test file executed");
	}

	public static void main(String[] args) {
		JunitClass results = new JunitClass();
		results.testUserName();
	}

}
