package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import org.junit.Test;

public class PasswordStrengthTest {
	@Test
	public void testlowercase() {
		PasswordStrength pes= new PasswordStrength();
		assertEquals(true,pes.islower("abcedf"));
		
		
	}
	@Test
	public void testUppercase() {
		PasswordStrength pes= new PasswordStrength();
		assertEquals(true,pes.isupper("ABCDEF"));
		
		
	}


	@Test
	public void testdigitStrength() {
		PasswordStrength pes= new PasswordStrength();
		assertEquals(9,pes.checkdigit("12345"));
		
		
	}
	
	@Test
	public void testSpecislStrength() {
		PasswordStrength pes= new PasswordStrength();
		assertEquals(15,pes.checkspecialchar("@#$%&!"));
		
		
	}
	@Test
	public void testPasswordStrength() {
		PasswordStrength pes= new PasswordStrength();
		assertEquals("Moderate",pes.passwordStrengthChecker("Divya@789"));
		assertEquals("Strong",pes.passwordStrengthChecker("Varshitha.J@78967"));
		assertEquals("Characters is less than 8",pes.passwordStrengthChecker("Varsh"));
		assertEquals("weak",pes.passwordStrengthChecker("Varshgthf12"));
		
		
	}

}
