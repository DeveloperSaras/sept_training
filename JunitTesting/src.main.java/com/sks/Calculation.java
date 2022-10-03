package com.sks;


//this is a comment
//this is another comment
public class Calculation {

	public static double convertToDecimal(int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException("Denominator must not be 0");
		}
		return (double) numerator / (double) denominator;
	}
	
	public static void main(String[] args) {
		
		System.out.println("Hi : " + convertToDecimal(10, 2));
		
	}

}
