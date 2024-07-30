package lab1;

/**
 * WAP to check if the given number is Armstrong or not
 */

import java.util.Scanner;
import java.lang.Math;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// creating a scanner object
		Scanner sc = new Scanner(System.in); 
		
		// declaration and initialization 
		int n; 
		double arm=0;
		int temp, power=0;
		
		
		// reading the number from the user
		System.out.println("Please enter the number: "); 
		n = sc.nextInt(); 
		
		// counting the number of digits in the number 
		temp = n;
		while(temp>0) {
			temp=temp/10;
			power++;
		}
		
		// checking if the provided number is an armstrong number
		temp = n;
		while(temp>0)
		{
			int digit = temp%10;
			arm = arm + Math.pow(digit,power);
			temp = temp/10;
		}
		boolean armstrong = false;
		if(n == arm)
			armstrong = true;
	
		// display statement
		System.out.println(armstrong?"The given number is armstrong":"The given number is not an armstrong number");

	}

}
