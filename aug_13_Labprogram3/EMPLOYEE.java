package aug_13_Labprogram3;

import java.util.Scanner;

public class EMPLOYEE 
{
	// global class variables
	String Ename; 
	int Eid; 
	int Basic; 
	double DA; 
	double Gross_sal; 
	double IT;
	double Net_sal; 
	
	static void read(EMPLOYEE obj, int n, Scanner sc, int counter)
	{
		System.out.println("Employee " + (counter+1) + " details: ");
		System.out.print("Enter name: "); 
		obj.Ename = sc.nextLine(); 
		System.out.print("Employee ID: "); 
		obj.Eid = sc.nextInt(); 
		System.out.print("Basic: "); 
		obj.Basic = sc.nextInt();
		sc.nextLine();
	}
	
	static void display(EMPLOYEE obj, int n, int i)
	{
		System.out.println("\n\nEmployee " + (i+1) + " details: ");
		System.out.println("Employee Name: " + obj.Ename); 
		System.out.println("Employee ID: " + obj.Eid); 
		System.out.println("Basic Salary: " + obj.Basic); 
		System.out.println("DA: " + obj.DA); 
		System.out.println("Gross Salary: " + obj.Gross_sal); 
		System.out.println("Income Tax: " + obj.IT); 
		System.out.println("Net Salary: " + obj.Net_sal); 
		System.out.println("\n\n\n");
	}
	
	static void compute_net_sal(EMPLOYEE obj, int n)
	{
		obj.DA = (0.52*obj.Basic);
		obj.Gross_sal = obj.DA + obj.Basic; 
		obj.IT = (0.30*obj.Gross_sal);
		obj.Net_sal = obj.Gross_sal-obj.IT;
	}
	
	public static void main(String[] args) 
	{
		// creating scanner object
		Scanner sc = new Scanner(System.in);
		// reading the value of n from the user
		System.out.print("Enter the number of employees: "); 
		int n = sc.nextInt();
		sc.nextLine(); 
		
		// creating class object of size 'n'
		EMPLOYEE obj[]; 
		obj = new EMPLOYEE[n];
		
		// reading employee data
		for(int counter = 0; counter < n; counter++)
		{
			obj[counter] = new EMPLOYEE();
			read(obj[counter], n, sc, counter);
			compute_net_sal(obj[counter], n);
			display(obj[counter], n, counter);
		}	
	}
}
