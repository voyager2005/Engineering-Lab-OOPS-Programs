package STUDENT;

public class ScienceStudent extends STUDENT{
	// private data member practicalMarks
	private int practicalMarks;
	
	// Parameterized constructor
    ScienceStudent(String name, int[] marks, int practicalMarks) {
        super(name, marks);
        this.practicalMarks = practicalMarks;
        compute(); // Recompute total and average including practical marks
    }

    // Override compute method to include practical marks
    @Override
    void compute() {
    	total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        total = total + practicalMarks;
        avg = (double) total / (marks_array.length + 1); // Include practical marks in average
    }

    // Method to display practical marks
    void displayPracticalMarks() {
        System.out.println("Practical Marks: " + practicalMarks);
    }

    // Override display method to include practical marks
    @Override
    void display() {
        super.display();
        displayPracticalMarks();
    }
}
