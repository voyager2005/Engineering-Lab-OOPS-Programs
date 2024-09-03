package lab6_Question3;

public class Main {
    public static void main(String[] args) {
        // Create a Person object
    	System.out.println("Displaying Object of Person Class: ");
        Person person = new Person("John Doe", "15/06/2024");
        System.out.println("Person Name: " + person.getPname());
        System.out.println("Person Birth Date: " + person.getDateOfBirth());

        // Create a CollegeGraduate object
        System.out.println("\n\nDisplaying object of CollegeGraduate Student: ");
        CollegeGraduate graduate = new CollegeGraduate("Jane Smith", "16/09/1955", 9.55, 1960);
        System.out.println("Graduate Name: " + graduate.getPname());
        System.out.println("Graduate Birth Date: " + graduate.getDateOfBirth());
        System.out.println("Graduate GPA: " + graduate.getGpa());
        System.out.println("Graduate Graduation Year: " + graduate.getGraduationYear());
    }
}
