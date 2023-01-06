package com.bridgelabz.core_java_problems;
import java.util.Scanner;

public class CheckVowel {
	public static void main(String args[]) {
		Scanner character = new Scanner(System.in);
        System.out.println("enter any alphabet character:");
     char ch = character.next().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'|| ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");
  }
	
}
