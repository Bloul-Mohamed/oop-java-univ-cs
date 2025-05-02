
// File: Main.java
// package labthree;

import labthree.*;

public class Main {
  public static void main(String[] args) {
    Clinic clinic = new Clinic();

    Doctor doctor1 = new Doctor("Dr.Mohamed", "Cardiology", 10);
    Doctor doctor2 = new Doctor("Dr.Kenzy", "Neurology", 18);
    Administrator admin1 = new Administrator("Ali", "HR");
    Administrator admin2 = new Administrator("Khaled", "Finance");
    Nurse nurse1 = new Nurse("Oussama", "Pediatrics", false);
    Nurse nurse2 = new Nurse("Aicha", "Surgery", true);

    clinic.addEmployee(doctor1);
    clinic.addEmployee(doctor2);
    clinic.addEmployee(admin1);
    clinic.addEmployee(admin2);
    clinic.addEmployee(nurse1);
    clinic.addEmployee(nurse2);

    clinic.showEmployees();

    System.out.println("Total Monthly Payroll: " + clinic.calculateMonthlyPayroll() + " $");
  }
}
