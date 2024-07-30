package lab1;

/**
 * WAP to find the factorial of a given number
 */

import java.util.Scanner;

public class factorial {
	public static void main(String[] args)
	{
		// creating a Scanner object
		Scanner sc = new Scanner(System.in);
		
		// declaration and initialization 
		int n; 
		long factorial = 1;
		
		// reading the number from the user
		System.out.println("Please enter the number: "); 
		n = sc.nextInt(); 
		
		// calculating the factorial
		for(int i = n; i>0; i--)
		{
			factorial = factorial * i;
		}
		
		// display statement
		System.out.println("The factorial of " + n + " is: " + factorial);
	}
}
