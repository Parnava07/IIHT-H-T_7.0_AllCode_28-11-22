package com.mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class TestCalculator {
	// Calculator c = new Calculator();
	Calculator c = null;
	CalculatorService service = Mockito.mock(CalculatorService.class);
	
	@Before
	public void setUp() {
		c = new Calculator(service);

	}
	@Test
	public void testPerform() {
		
		when(service.add(110, 40)).thenReturn(150);
		assertEquals(150, c.perform(110,40));
		
	}
	
	@Test
	public void testPerform1() {
		
		when(service.sub(110, 40)).thenReturn(70);
		assertEquals(70, c.perform1(110,40));
		
	}
	@Test
	public void testPerform2() {
		
		when(service.sub(11, 4)).thenReturn(44);
		assertEquals(44, c.perform2(11,4));
		
	}

//	@Test
//	public void testAdd() {
//		assertEquals(50, c.add(25, 25));
//	}
//
//	@Test
//	public void testSub() {
//		assertEquals(5, c.sub(25, 20));
//	}
//
//	@Test
//	public void testMultiply() {
//		assertEquals(50, c.multiply(25, 2));
//	}

}
