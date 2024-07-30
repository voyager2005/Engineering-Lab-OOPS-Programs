package lab1;

/**
 * WAP to find the sum of the given digits
 */

import java.util.Scanner;

public class sum 
{
	public static void main(String[] args) 
	{
		// creating a Scanner object
		Scanner sc = new Scanner(System.in);
		
		// declaration and initialization 
		int n; 
		int sum = 0;
		
		// reading the number from the user
		System.out.println("Please enter the number: "); 
		n = sc.nextInt(); 
		
		// calculating the sum of the digits in n
		int temp = n; 
		while(temp > 0) 
		{
			int digit = temp%10; 
			sum = sum + digit; 
			temp = temp/10;
		}
		
		// displaying the SOD: 
		System.out.println("the sum of the digits on " + n + " is: " + sum);
	}
}
