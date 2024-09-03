package lab6_Question3;

public class Person {
	// instance variables
	private String Pname; 
	private String DateOfBirth;
	
	
	// default public constructor
	public Person(String name, String DateOfBirth) {
		this.Pname = name; 
		this.DateOfBirth = DateOfBirth;
	}
	
	// Accessor methods
	public String getPname() {
		return Pname;
	}
	
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	
	public void setPname(String name) {
		this.Pname = name;
	}
	
	public void setDateOfBirth(String DateOfBirth) {
		this.DateOfBirth = DateOfBirth;
	}
}
