package EMPLOYEE;

import java.util.Scanner;

class EMPLOYEE {
    String Ename;
    int Eid;
    double Basic, DA, Gross_Sal, Net_Sal;

    // Default constructor
    public EMPLOYEE() {
        this.Ename = "Unknown";
        this.Eid = 0;
        this.Basic = 0.0;
        this.DA = 0.0;
        this.Gross_Sal = 0.0;
        this.Net_Sal = 0.0;
    }

    // Parameterized constructor
    public EMPLOYEE(String Ename, int Eid, double Basic) {
        this.Ename = Ename;
        this.Eid = Eid;
        this.Basic = Basic;
        compute_net_sal();
    }

    // Method to compute net salary
    void compute_net_sal() {
        DA = 0.52 * Basic;
        Gross_Sal = Basic + DA;
        double IT = 0.30 * Gross_Sal;
        Net_Sal = Gross_Sal - IT;
    }

    // Method to format employee name
    void formatEmployeeName() {
        String[] words = Ename.split(" ");
        StringBuilder formattedName = new StringBuilder();
        for (String word : words) {
            formattedName.append(Character.toUpperCase(word.charAt(0)))
                         .append(word.substring(1).toLowerCase())
                         .append(" ");
        }
        Ename = formattedName.toString().trim();
    }

    // Method to generate email address
    String generateEmail() {
        String[] names = Ename.split(" ");
        String email = names[0].charAt(0) + names[names.length - 1];
        return email.toLowerCase() + "@example.com";
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee Name: " + Ename);
        System.out.println("Employee ID: " + Eid);
        System.out.println("Basic Salary: " + Basic);
        System.out.println("DA: " + DA);
        System.out.println("Gross Salary: " + Gross_Sal);
        System.out.println("Net Salary: " + Net_Sal);
        System.out.println("Email: " + generateEmail());
        System.out.println();
    }
}

