package lab4;

class EMPLOYE 
{
	private String name;
	private int id;
	private double salary;

	// Default constructor
	public EMPLOYE() 
	{
		this.name = "Akshat G";
		this.id = 235890190;
		this.salary = 750000.0;
	}
	
	//Parameterized constructor
	public EMPLOYE(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	//Display method
	public void display() {
		System.out.println("Employee Name: " + name);
		System.out.println("Employee ID: " + id);
		System.out.println("Employee Salary: " + salary);
	}
	
	//Main method to illustrate usage
	public static void main(String[] args) {
    // 	Using default constructor
		EMPLOYE emp1 = new EMPLOYE();
		emp1.display();
		
    // Using parameterized constructor
		EMPLOYE emp2 = new EMPLOYE("Divyansh Gupta", 235890236, 500000.0);
		emp2.display();
	}
}
