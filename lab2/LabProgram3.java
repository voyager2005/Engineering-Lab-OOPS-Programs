package lab2;

import java.util.*;

public class LabProgram3 
{
	/**
	 * @param fact: holds the value of the factorial of n
	 * @param n   : holds the value whose factorial is to be calculated
	 * @return    : the value of the factorial to the caller method
	 */
	static int factorial(int fact, int n)
	{
		for(; n>0; n--) fact*=n;
		return fact;
	}

	public static void main(String[] args) 
	{
		// creating Scanner object
		Scanner sc = new Scanner(System.in); 
		
		// declaration and initialization 
		int n, r, fact; 
		
		// reading the number from the user
		System.out.println("Enter value for factorial: "); 
		n = sc.nextInt();
		
		// calling the fact function
		fact = factorial(1, n);
		
		// display statement
		System.out.println("The factorial of " + n + " is: " + fact);
		
		// calculating nCr 
		System.out.println("Enter values of n and r (to computer nCr): "); 
		n = sc.nextInt(); 
		r = sc.nextInt(); 
		
		// displaying value of ncr
		int ncr = (factorial(1, n)/(factorial(1, r)*factorial(1, n-r)));
		System.out.println(n + "C" + r + " is: " + ncr);
	}

}
