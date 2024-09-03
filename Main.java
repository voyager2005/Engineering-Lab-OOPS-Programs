package lab6_Question4;

//Main.java
public class Main {
 public static void main(String[] args) {
     Building building = new Building(5000, 3);
     House house = new House(2500, 2, 4, 3);
     School school = new School(10000, 4, 20, "Elementary");

     System.out.println("Building: " + building.getSquareFootage() + " sqft, " + building.getStories() + " stories");
     System.out.println("House: " + house.getSquareFootage() + " sqft, " + house.getStories() + " stories, " + house.getBedrooms() + " bedrooms, " + house.getBaths() + " baths");
     System.out.println("School: " + school.getSquareFootage() + " sqft, " + school.getStories() + " stories, " + school.getClassrooms() + " classrooms, " + school.getGradeLevel() + " grade level");
 }
}