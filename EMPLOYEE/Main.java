package EMPLOYEE;

public class Main {
    public static void main(String[] args) {
        // Creating a full-time employee
    	System.out.println("Displaying for Full Time Empplyee: ");
        FullTimeEmp fullTimeEmp = new FullTimeEmp("Alice Johnson", 102, 60000, 5000, 2000);
        fullTimeEmp.formatEmployeeName();
        fullTimeEmp.display();

        // Creating a part-time employee
        System.out.println("\nDisplaying for Part Time Employee: ");
        PartTimeEmp partTimeEmp = new PartTimeEmp("Bob Smith", 103, 120);
        partTimeEmp.formatEmployeeName();
        partTimeEmp.display();
    }
}
