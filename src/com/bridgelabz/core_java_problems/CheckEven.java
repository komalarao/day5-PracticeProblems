package com.bridgelabz.core_java_problems;

import java.util.Scanner;

public class CheckEven {

	public static void main(String[] args) {
		System.out.println("welcome to core java problems");
		Scanner number = new Scanner(System.in);
		System.out.println("enter a number");
		int Even_Check = number.nextInt();
		if(Even_Check%2== 0) {
			System.out.println(Even_Check+" is even number");
		}else {
			System.out.println(Even_Check+" is odd number");
		}
	}

}
