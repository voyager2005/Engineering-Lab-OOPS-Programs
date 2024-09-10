package STUDENT;

//Define the Result class that extends Student and implements Sports
class Result extends Student implements Sports {
	private char grade;

	// Constructor to initialize grade
	public Result(char grade) {
		this.grade = grade;
	}

	// Implement the putGrade method from Sports interface
	@Override
	public void putGrade() {
		System.out.println("Grade in Sports: " + grade);
	}
	
	// Method to display the final result
	public void displayResult() {
		System.out.println("Roll Number: " + getRollNumber());
		System.out.println("Marks: " + getMarks());
		putGrade();
	}
	
	public static void main(String[] args) {
     // Create a Result object
		Result studentResult = new Result('A');
		
     // Set roll number and marks
		studentResult.setRollNumber(101);
		studentResult.setMarks(85);
		
     // Display the final result
		studentResult.displayResult();
	}
}
				