package EMPLOYEE;

public class FullTimeEmp extends EMPLOYEE{
	// data members 
	double bonus; 
	double deductions; 
	
	public FullTimeEmp(String Ename, int Eid, double Basic, double bonus, double deductions) {
        super(Ename, Eid, Basic);
        this.bonus = bonus;
        this.deductions = deductions;
        compute_net_sal();
    }
	
	// Member Functions
	@Override
	void compute_net_sal() {
		super.compute_net_sal();
		Net_Sal = Gross_Sal + bonus - deductions;
	}
	
	@Override
	void display() {
		System.out.println("Employee Name: " + Ename + "\n"
				+ "Employee Salary: " + Net_Sal + "\n"
				+ "Empoyee Gross Salary: " + Gross_Sal + "\n"
				+ "Employee Bonus and Deductions: " + bonus + ", " + deductions);
	}
}
