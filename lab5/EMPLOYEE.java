package lab5;

import java.util.Scanner;
import java.lang.Math;

public class EMPLOYEE {
	// global class variables
	String Ename; 
	int Eid; 
	int Basic; 
	double DA; 
	double Gross_sal; 
	double IT;
	double Net_sal; 
	String EmployeeEmail;
	
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
		System.out.println("Employee email: " + obj.EmployeeEmail);
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
	
	public void formatEmployeeName(){
		Ename = Ename.toLowerCase();
		Ename = Ename + " ";
		String s = ""; 
		String word = "";
		for(int i = 0; i < Ename.length(); i++) {
			char ch = Ename.charAt(i);
			if(ch!=' ')
			{
				word = word + ch;
			}
			else
			{
				s = s + word.substring(0,1).toUpperCase() + word.substring(1) + " ";
				word = "";
			}
		}
		
		Ename = s.substring(0,s.length());
	}
	
	public void generateEmail() {
		int digit = (int)(Math.random()*100);
		String s = Ename.toLowerCase();
		String Name = "";
		for(int i = 0; i< s.length(); i++)
		{
			if(s.charAt(i)!= ' ')
				Name = Name + s.charAt(i);
			else
				Name = Name + ".";
		}
		EmployeeEmail = Name + digit + "@gmail.com";
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
			obj[counter].formatEmployeeName();
			obj[counter].generateEmail();
			display(obj[counter], n, counter);
		}	
	}
}
