package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class NumberSorterTest {

	@Test
	public void test() {
		Integer [] data =new Integer[] {57,32,0,46,-1,71,1};
		System.out.println(Arrays.asList(data));
		Arrays.sort(data, new NumberSorter());
		System.out.println(Arrays.asList(data));
		assertArrayEquals( new Integer[] {-1,1,57,71,46,32,0},data );
		
		//assertArrayEquals( new integer[] {1,57,71,46,32},data);
	}

}
