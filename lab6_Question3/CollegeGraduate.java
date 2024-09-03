package lab6_Question3;

public class CollegeGraduate extends Person{
	// instance variables
	private double gpa; 
	private int graduationYear;
	
	// Constructor
    public CollegeGraduate(String name, String birthDate, double gpa, int graduationYear) {
        super(name, birthDate);
        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }

    // Accessor methods
    public double getGpa() {
        return gpa;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    // Mutator methods (optional)
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}
