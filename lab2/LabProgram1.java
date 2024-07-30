package lab2;

import java.util.*;

public class LabProgram1 
{
	/**
	 * @param x;
	 * @param y;
	 * @param z;
	 */
	static void nestedMax(int x, int y, int z)
	{
		if(x>y)
			if(x>z)
				System.out.println(x + " is the largest");
		if(y>x)
			if(y>z)
				System.out.println(y + " is the largest");
		if(z>y)
			if(z>x)
				System.out.println(z + " is the largest");
	}
	
	/**
	 * @param x;
	 * @param y;
	 * @param z;
	 */
	static void ladderMax(int x, int y, int z)
	{
		if(x > y && x > z)
			System.out.println(x + " is the largest");
		else if(y > z && y > x)
			System.out.println(y + " is the largest");
		else if(z > y && z > x)
			System.out.println(z + " is the largest");
	}

	public static void main(String[] args) 
	{
		// declaration and initialization 
		int[] a = new int[3];
		
		// creating a scanner object
		Scanner sc = new Scanner(System.in);
		
		// reading the three numbers from the user
		for(int i = 0; i < 3; i++)
		{
			System.out.println("Please enter number " + (i+1) + ": "); 
			a[i] = sc.nextInt(); 
		}
		
		// assigning values 
		int x = a[0], y = a[1], z = a[2];
		
		char ch = '1'; 
		
		// calling the functions
		System.out.println("Please enter choice \n1. Using nested if\n2. Using else if"); 
		ch = sc.next().charAt(0); 
		if(ch=='1')
			nestedMax(x, y, z);
		else
			ladderMax(x, y, z);
	}
}
