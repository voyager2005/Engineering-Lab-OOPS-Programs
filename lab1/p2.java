package lab1;

import java.util.Scanner;

/**
 * WAP to read name, RollNo, marks of a student and display it
 */

public class p2 {
	public static void main(String[] args) 
	{
		// creating a Scanner object
		Scanner sc = new Scanner(System.in);
		
		// declaration and initialization 
		String name; 
		int RollNum; 
		float marks; 
		
		// reading the number from the user
		System.out.println("Please enter your name: "); 
		name = sc.nextLine().trim(); 
		System.out.println("Please enter your Roll Number: "); 
		RollNum = sc.nextInt(); 
		System.out.println("Please enter your marks: "); 
		marks = sc.nextFloat(); 
		
		// display statement
		System.out.println("Name : " + name);
		System.out.println("Roll Number : " + RollNum);
		System.out.println("Marks : " + marks);
		
	}
}
