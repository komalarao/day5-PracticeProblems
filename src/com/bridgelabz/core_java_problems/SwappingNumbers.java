package com.bridgelabz.core_java_problems;
import java.util.Scanner;

public class SwappingNumbers {
	public static void main(String args[]) {
	Scanner first = new Scanner(System.in);
    System.out.println("enter first number:");
    int first_number = first.nextInt();
    System.out.println("enter second number:");
    int second_number = first.nextInt();   

      System.out.println("--Before swap--");
      System.out.println("First number = " + first_number);
      System.out.println("Second number = " + second_number);

      int temporary = first_number;

      first_number = second_number;

      second_number = temporary;

      System.out.println("--After swap--");
      System.out.println("First number = " + first_number);
      System.out.println("Second number = " + second_number);
  }
	
}
