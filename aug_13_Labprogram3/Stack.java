package aug_13_Labprogram3;

import java.util.Scanner; 

public class Stack 
{
	// instance variables
	static int max_size = 10;
	static int[] arr = new int[max_size]; 
	static int top = -1; 
	
	static void push(Scanner sc)
	{
		if(top < (max_size)-1)
		{
			top = top+1;
			System.out.println("Enter the element: ");
			int a = sc.nextInt();
			arr[top] = a;
		}
		else
		{
			System.out.println("Stack Overflow!");
		}
	}
	
	static void pop()
	{
		if(top > 0)
		{
			System.out.println(arr[top] + " popped from the stack");
			top--;
		}
		else
		{
			System.out.println("Stack Underflow!");
		}
	}
	
	static void display()
	{
		System.out.println("The array elements are: ");
		for(int i = top; i >= 0; i--)
		{
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) 
	{
		// declaration and initialization 
		boolean contd = true; 
		int choice;
		
		// creating Scanner object
		Scanner sc = new Scanner(System.in); 
		
		while(contd)
		{
			// reading the operation to be performed
			System.out.println("Please enter your choice: \n1.Push\n2.Pop\n3.Display"); 
			choice = sc.nextInt();
			
			if(choice == 1)
				push(sc); 
			else if(choice == 2)
				pop();
			else if(choice == 3)
				display();
			else
				System.out.println("INVALID CHOICE");
			
			// asking if the user wishes to continue
			System.out.println("Enter [y] to continue and [n] to exit");
			if(sc.next().charAt(0) != 'y')
				break;
		}
	}
}
