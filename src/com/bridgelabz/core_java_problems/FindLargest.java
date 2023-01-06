package com.bridgelabz.core_java_problems;

import java.util.Scanner;

public class FindLargest {

	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		 System.out.println("enter the first number");
		 int First_Number = number.nextInt();
		 System.out.println("enter the second number");
		 int Second_Number = number.nextInt();
		 System.out.println("enter the third number");
		 int Third_Number = number.nextInt();
	      if (First_Number>Second_Number && First_Number>Third_Number ) {
	    		 System.out.println("first number is largest:");

	      }else if(Second_Number>First_Number && Second_Number> Third_Number) {
	 		 System.out.println("second number is largest:");

	      }else {
	  		 System.out.println("third number is largest:");

	      }
	}
}
