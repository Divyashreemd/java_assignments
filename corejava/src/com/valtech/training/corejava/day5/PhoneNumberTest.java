package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PhoneNumberTest {

	PhoneNumber p= new PhoneNumber();
	List<Long> nums = new ArrayList<>();
	
	@Test
	public void test() {
		nums.add(1029856743L);
		nums.add(9846539171L);
		int n=nums.size();
		
		
		assertEquals(0,PhoneNumber.phoneNo(n, nums));
	}
	@Test
	public void test1() {
		nums.add(9090909090L);
		nums.add(1444414444L);
		//nums.add(1234567898L);
		int n=nums.size();
		
		
		assertEquals(0,PhoneNumber.phoneNo(n, nums));
	}
	@Test
	public void test2() {
		nums.add(9987878787L);
		nums.add(9595262609L);
		int n=nums.size();
		
		
		assertEquals(0,PhoneNumber.phoneNo(n, nums));
	}
	
}
