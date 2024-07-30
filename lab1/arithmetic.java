package lab1;

/**
 * Java program to read two number and perform arithmetic operations
 * and display the results
 */

import java.util.Scanner;
import java.lang.Math;

public class arithmetic {
	public static void main(String[] args)
	{
		// creating Scanner object
		Scanner sc = new Scanner(System.in); 
		
		// declaration and initialization 
		int a, b; 
		
		// reading the numbers from the user
		System.out.println("Please enter the first number: "); 
		a = sc.nextInt(); 
		System.out.println("Please enter the second number: "); 
		b = sc.nextInt();
		
		// display statement
		System.out.println("addition: " + (a+b));
		System.out.println("subtraction: " + (a-b));
		System.out.println("multiplication: " + (a*b));
		System.out.println("division: " + (a/b));
		System.out.println("power: " + Math.pow(a, b));
	}
}
