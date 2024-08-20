package lab4;

import java.util.Scanner;
public class STUDENT 
{
	String sname; 
	int[] marks_array; 
	int total; 
	double avg;
	
	public STUDENT()
	{
		sname = "Akshat G"; 
		marks_array = new int[]{60, 70, 80, 90, 100};
		total = 0;
	} 
	
	public STUDENT(String name, Scanner sc, int[] arr)
	{
		sname = name; 
		marks_array = new int[arr.length];
		for(int i = 0; i < arr.length; i++)
			marks_array[i] = arr[i]; 
		total = 0;
	}
	
	static void display(STUDENT obj)
	{
		System.out.println("Student Name: " + obj.sname);
		System.out.println("Marks: ");
		for(int i: obj.marks_array)
			System.out.println(i); 
		compute(obj); 
		System.out.println("Total: " + obj.total); 
		System.out.println("Average: " + obj.avg);
	}
	
	static void compute(STUDENT obj)
	{
		for(int i: obj.marks_array)
		{
			obj.total = obj.total + i;
		}
		obj.avg = obj.total/obj.marks_array.length;
	}
	
	public static void main(String[] args) 
	{
		// declaring scanner object
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Displaying the default values: ");
		STUDENT stu1 = new STUDENT();
		display(stu1);
		
		// reading details of student 2 for parameterized constructor:
		System.out.println("Enter the name for the second student: "); 
		String name = sc.nextLine().trim();
		System.out.println("Please enter the number of subjects: "); 
		int n = sc.nextInt(); 
		int[] arr = new int[n];
		System.out.println("Please enter the marks:");
		for(int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		STUDENT stu2 = new STUDENT(name, sc, arr);
		display(stu2);
		
	}

}
