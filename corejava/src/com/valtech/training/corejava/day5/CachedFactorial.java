package com.valtech.training.corejava.day5;

import java.util.ArrayList;
import java.util.List;

public class CachedFactorial {

	List<Long> factorials = new ArrayList<>();

	public long fact(int n) {

		if (factorials.size() >= n ) {
			System.out.println("Returning from cache....");
			return factorials.get(n - 1);
		}
		
		if(n==1) {
			factorials.add(1L);
			return 1;
		}
		
		long fact1 = fact(n-1);
		long factn = n*fact1;
		factorials.add(factn);
		return factn;
		

	}

}
