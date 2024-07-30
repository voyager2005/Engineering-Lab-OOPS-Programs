package lab2;

import java.util.*;

public class AdditionalProgram2 
{
	/**
	 * @param n : stores value whose sum is to be calculated
	 * @return  : the value the sum of the digits of n
	 */
	static int findSum(int n)
	{
		// calculating the sum of the digits in n
		int temp = n; 
		int sum = 0;
		while(temp > 0) 
		{
			int digit = temp%10; 
			sum = sum + digit; 
			temp = temp/10;
		}
		
		return sum;
	}
	
	public static void main(String args[])
	{
		// creating Scanner object
		Scanner sc = new Scanner(System.in);
				
		// declaration and initialization 
		int n;
				
		// reading the number from the user
		System.out.println("Please enter the number: "); 
		n = sc.nextInt(); 
				
		int sum = findSum(n);
				
		// displaying the SOD: 
		System.out.println("the sum of the digits on " + n + " is: " + sum);
	}
}
