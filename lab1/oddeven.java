package lab1; 

import java.util.Scanner;

public class oddeven{
	public static void main(String[] args) {
		// creating a Scanner object
		Scanner sc = new Scanner(System.in); 
		
		// declaration and initialization 
		int n; 
		
		// reading the value of n from the user
		System.out.println("Please enter a number: "); 
		n = sc.nextInt(); 
		
		// odd even calculation 
		if(n%2==0)
			System.out.print(n + " is an even number"); 
		else
			System.out.print(n + " is an odd number");
	}
}