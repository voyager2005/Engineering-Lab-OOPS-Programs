package STUDENT;

class STUDENT {
    String sname;
    int[] marks_array;
    int total;
    double avg;

    // Default constructor
    STUDENT() {
        sname = "Unknown";
        marks_array = new int[5]; // Default array size
        compute(); // Compute total and average for default values
    }

    // Parameterized constructor
    STUDENT(String name, int[] marks) {
        sname = name;
        marks_array = marks;
        compute(); // Compute total and average when assigning marks
    }

    // Method to compute total and average marks
    void compute() {
        total = 0;
        for (int mark : marks_array) {
            total += mark;
        }
        avg = (double) total / marks_array.length;
    }

    // Method to display the STUDENT object
    void display() {
        System.out.println("Student Name: " + sname);
        System.out.print("Marks: ");
        for (int mark : marks_array) {
            System.out.print(mark + " ");
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + avg);
    }
}
