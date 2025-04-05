package labtwo;

import java.util.ArrayList;

/**
 * StudentUnique
 */
public class StudentUnique {

  String firstName;
  String lastName;
  int id;
  ArrayList<Double> grades;

  // Constructor
  public StudentUnique() {
    this.firstName = "Unknown";
    this.lastName = "Unknown";
    this.id = 0;
    this.grades = new ArrayList<Double>();
  }

  public StudentUnique(String firstName, String lastName, int id) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.id = id;
    this.grades = new ArrayList<Double>();
  }

  public void display() {
    System.out.println("Student Name: " + this.firstName + " " + this.lastName);
    System.out.println("Student ID: " + this.id);
    System.out.println("Grades: " + this.grades);
  }

  public double calculateAverage() {
    double sum = 0;
    for (double grade : this.grades) {
      sum += grade;
    }
    return sum / this.grades.size();
  }

}
