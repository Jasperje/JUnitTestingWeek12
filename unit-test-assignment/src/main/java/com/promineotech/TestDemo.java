package com.promineotech;

import java.util.Random;

public class TestDemo {


		public int addPositive(int a, int b) {
		
		int sum = a + b; 
		
		if(a > 0 && b > 0) {
			return sum;
			
		} else {
			throw new IllegalArgumentException("Both parameters must be positive!");
		  
	  }
	}
		
		
		//write your own method in TestDemo.java - "any method is fine"...
		//here is a method to test if two positive integers being multiplied
		//do in fact come up with the correct value as the product(solution). 
		//if the two integer variables, X and Y, are positive and multiplied together 
		//correctly, the product will be returned.
		//If either of the integers are greater than or equal to zero,
		//an Illegal Argument exception should be thrown.
		
		public int multiplyPositiveIntegers(int x, int y) {
			
			int product = x * y;
			
				if(x>0 && y>0) {
					return product;
					
				} else {
					throw new IllegalArgumentException("Both Integers must be positive!");
				}
		
			
		}

		//This method obtains a random int between 1 and 10 and then 
		//returns the square of the number.
		
		
		public int randomNumberSquared() {
			
		int result = getRandomInt();
		
		return result*result;
		
		}
		
		
		int getRandomInt() {

		    Random random = new Random();

		    return random.nextInt(10) + 1;

	}
	}
		
	
  
	
