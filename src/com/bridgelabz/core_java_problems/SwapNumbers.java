package com.bridgelabz.core_java_problems;
import java.util.Scanner;

public class SwapNumbers {
		  float numbers(){
			float harmonic = 1;
			float num = 1;
			   Scanner number = new Scanner(System.in);
			   System.out.println("enter any number to display the sum of  numbers in harmonic form");
			   int n = number.nextInt();
			   
			  for (int j=1; j<=n;j++) {
				  
				  harmonic = harmonic+(float)1/j;
				  System.out.println("sum of the harmonic numbers until "+(num/j)+" is "+harmonic);
			  }return harmonic;
		  }
		   public static void main(String[] args) {
				new HarmonicSum().numbers();  
		   
		   }
	
}
