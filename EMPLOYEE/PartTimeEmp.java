package EMPLOYEE;

public class PartTimeEmp extends EMPLOYEE{
	// adding data members 
	int hoursWorked; // represents the number of hours worked by the part-time-employee
	static final double hourlyRate = 100.00; // represents the hourly rate at which the part-tmie employee is paid/ 
	
	// parameterized constructor
	public PartTimeEmp(String Ename, int Eid, int hoursWorked) {
        super(Ename, Eid, 0);
        this.hoursWorked = hoursWorked;
        compute_net_sal();
    }
	
	// adding Member Functions
	@Override
	void compute_net_sal() {
        Gross_Sal = hoursWorked * hourlyRate;
        double IT = 0.30 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }
	
	@Override
    void display() {
        super.display();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: " + hourlyRate);
        System.out.println();
    }
}
