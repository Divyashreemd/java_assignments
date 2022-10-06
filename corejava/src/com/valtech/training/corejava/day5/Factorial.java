package com.valtech.training.corejava.day5;

public class Factorial {
	public long fact(long n) {
		if(n==0) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
		
		
	}
	  
	public static void main(String[] args) {
		long i=6;
		Factorial num = new Factorial();
		System.out.println(num.fact(i));
		
	}


}
