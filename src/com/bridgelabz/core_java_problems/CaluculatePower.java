package com.bridgelabz.core_java_problems;
import java.util.Scanner;

public class CaluculatePower {
	static int power(int num, int pow) {
		  int power =1;
		  
		for(int i=1;i<=pow;i++) {
			 power =power*num;
			 
		}
		  
	     return power;
	}

		public static void main(String args[]) {
		System.out.println( "result is "+power(3,22));
  }
	
}
