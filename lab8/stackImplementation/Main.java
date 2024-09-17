package lab8.stackImplementation;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StackImplementation s = new StackImplementation();
		
		// menu to read the choice from the user
		boolean condition = true;
		while(condition) { 
			System.out.println("1.Push\n2.Pop\n3.Display\n4.Exit");
			switch(sc.nextInt()) {
				case 1: 
					System.out.println("Enter the element you want to push: "); 
					int item = sc.nextInt();
					s.push(item);
					break; 
				case 2: 
					System.out.println("Removed " + s.pop()+ " from stack");
					break; 
				case 3: 
					s.display();
					break; 
				case 4: 
					condition = false;
					break;
			}
		}
	}
}
