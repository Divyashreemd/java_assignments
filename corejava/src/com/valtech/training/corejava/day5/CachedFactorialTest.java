package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class CachedFactorialTest {

	@Test
	public void test() {
		CachedFactorial cf = new CachedFactorial();
		assertEquals(6, cf.fact(3));
		assertEquals(120, cf.fact(5));
		//assertEquals(120, cf.fact(5));
		//assertEquals(720, cf.fact(6));
	}
	

}
