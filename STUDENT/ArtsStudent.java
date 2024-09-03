package STUDENT;

//Subclass for Arts students
class ArtsStudent extends STUDENT {
 private String electiveSubject;

 // Parameterized constructor
 ArtsStudent(String name, int[] marks, String electiveSubject) {
     super(name, marks);
     this.electiveSubject = electiveSubject;
 }

 // Method to display elective subject
 void displayElectiveSubject() {
     System.out.println("Elective Subject: " + electiveSubject);
 }

 // Override display method to include elective subject
 @Override
 void display() {
     super.display();
     displayElectiveSubject();
 }
}
