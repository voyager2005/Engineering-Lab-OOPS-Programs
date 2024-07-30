package lab2;

import java.util.*;

public class AdditionalProgarm1 
{
	/**
	 * @param n : hold value to check for prime condition
	 * @return  : <boolean> value for prime condition
	 */
	static boolean isPrime(int n)
	{
		boolean isPrime = true; 
		for(int i = 2; i<=n/2; i++)
		{
			if(n%i==0)
			{
				isPrime = false; 
				break;
			}
		}
		return isPrime;
	}
	
	public static void main(String args[])
	{
		// creating Scanner object
		Scanner sc = new Scanner(System.in); 
		
		// declaration and initialization 
		int n; 
		
		// reading the number from the user
		System.out.println("Please enter a value: ");
		n = sc.nextInt(); 
		
		// calling isPrime() function 
		boolean isPrime = isPrime(n); 
		
		// displaying if the number is prime or not
		if(isPrime)
			System.out.println(n + " is a prime number");
		
		// displaying all the prime numbers between 2 and n
		System.out.println("The prime numbers between 2 and " + n + " are: ");
		for(int i = 2; i <= n; i++)
			if(isPrime(i))
				System.out.print(i +", ");
	}
}
