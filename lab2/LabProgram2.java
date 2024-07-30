package lab2;

import java.util.*;

public class LabProgram2 
{
	/**
	 * @param n        : <integer> hold the user entered value
	 * @return reverse : <integer> reverse number of user entered value
	 */
	static int reverse(int n)
	{
		int reverse = 0;
		while(n>0)
		{
			int digit = n%10; 
			reverse = (reverse*10) + digit; 
			n = n/10;
		}
		return reverse;
	}
	
	public static void main(String[] args) 
	{
		// creating a Scanner object
		Scanner sc = new Scanner(System.in); 
		
		// reading the number from the user
		System.out.println("Enter a value: "); 
		int value = sc.nextInt(); 
		
		// calling the reverse function 
		int rev = reverse(value);
		
		// displaying the reverse of the function 
		System.out.println("The reverse of " + value + " is " + rev);
		
		// checking for palindrome condition
		if(rev == value)
			System.out.println("The number is a palindrome"); 
		else
			System.out.println("The number is not a palindrome");
	}
}
