package STUDENT;

public class Main {
    public static void main(String[] args) {
        // Create a STUDENT object
        STUDENT student = new STUDENT("John Doe", new int[]{85, 90, 78, 92, 88});
        System.out.println("Displaying Default Student Object: ");
        student.display();

        // Create a ScienceStudent object
        ScienceStudent scienceStudent = new ScienceStudent("Alice Johnson", new int[]{80, 85, 88, 90, 87}, 95);
        System.out.println("\nDisplaying Science Student Object: ");
        scienceStudent.display();

        // Create an ArtsStudent object
        ArtsStudent artsStudent = new ArtsStudent("Jane Smith", new int[]{75, 80, 85, 90, 95}, "History");
        System.out.println("\nDisplaying Arts Student Object: ");
        artsStudent.display();

        // Demonstrate dynamic polymorphism
        System.out.println("\nCreating a Dynamic Student Object to observe polymorphism: ");
        STUDENT dynamicStudent;
        
        System.out.println("\nDisplaying Dynamic Student Object under Science Student: ");
        dynamicStudent = scienceStudent;
        dynamicStudent.display();

        System.out.println("\nDisplaying Dynamic Student Object under Arts Student: ");
        dynamicStudent = artsStudent;
        dynamicStudent.display();
    }
}
