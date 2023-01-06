package com.bridgelabz.core_java_problems;

import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		int count = 0;
		Scanner numbers = new Scanner(System.in);
		System.out.println("enter any integer:");
	    int	number = numbers.nextInt();
	     
	     int factor;
			   for(factor=1;factor<=number/2;factor++) {
				 if(number % factor == 0) {
					System.out.println(factor+ " is a factor to the "+number);
					count = count+1;
				 }				 
			   }
			   System.out.println("number of factors of "+number+" is "+count);
	}
}
