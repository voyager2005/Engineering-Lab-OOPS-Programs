package lab5;

import java.util.Scanner;

public class NewStudentRegistration {
	// instance variables
	int registrationNumber; 
	String fullName;
	String doj;
	short semester; 
	float GPA; 
	float CGPA;
	
	
	public NewStudentRegistration(
			String name, int yoj, int joinee, String doj, short sem, 
			float GPA, float CGPA
			) {
		this.fullName = name; 
		this.semester = sem; 
		this.GPA = GPA; 
		this.CGPA = CGPA; 
		this.doj = doj;
		
		// computing registration number
		this.registrationNumber = ((yoj%100) * 100) + joinee;
		
	}
	
	public void display() {
		System.out.println("Student Name: " + this.fullName);
		System.out.println("Registration Number: " + this.registrationNumber);
		System.out.println("Date of joining: [dd/mm/yyyy]: " + this.doj); 
		System.out.println("Semester: " + this.semester); 
		System.out.println("GPA: " + this.GPA); 
		System.out.println("CGPA: " + this.CGPA); 
	}
	
	
	public static void main(String[] args) {
		// creating Scanner object
		Scanner sc = new Scanner(System.in); 
		
		// declaration and initialization 
		int n;
		
		// reading the number of student records to be entered by the user
		while(true) {
			System.out.println("Please enter the number of student records: [min:5]: "); 
			n = sc.nextInt(); 
			
			if(n>=5)
				break;
			else
				System.out.println("Enter a value greater than 5"); 
		}
		
		sc.nextLine();
		
		// creating a student object
		NewStudentRegistration[] student = new NewStudentRegistration[n];
		
		// calling the functions to register the given number of stuents
		for(int i = 0; i < n; i++) {
			// reading student information from user
			System.out.println("\nEnter the Student Name: ");
			String name = sc.nextLine().trim();
			System.out.println("Enter the year of registration: "); 
			int yor = sc.nextInt();
			System.out.println("Enter joinee number: "); 
			int joinee = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter date of joining: [dd/mm/yyyy]: "); 
			String doj = sc.nextLine().trim();
			System.out.println("Enter Semester: "); 
			short sem = sc.nextShort();
			System.out.println("Enter GPA: "); 
			float GPA = sc.nextFloat();
			System.out.println("Enter CGPA: "); 
			float CGPA = sc.nextFloat();
			sc.nextLine();
			
			student[i] = new NewStudentRegistration(
					name, yor, joinee, doj, sem, GPA, CGPA
					);
		}
		
		System.out.println("\n\nDisplaying the student records: \n");
		// calling the display function
		for(int i = 0; i < n; i++) {
			System.out.println("Student " + (i+1) + " details: ");
			student[i].display();
		}
	}
}
