package labtwo;

import java.util.ArrayList;

/**
 * StudentUnique
 */
public class StudentUnique {

  private String firstName;
  private String lastName;
  private int id = 0;
  private ArrayList<Double> grades;
  private static int idCounter = 0;

  // Constructor
  public StudentUnique() {
    this.firstName = "Unknown";
    this.lastName = "Unknown";
    this.id = ++idCounter;

    this.grades = new ArrayList<Double>();
  }

  public StudentUnique(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.grades = new ArrayList<Double>();
    this.id = ++idCounter;
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

  public void setGrade(double grade) {
    this.grades.add(grade);
  }

  public void setid(int id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getFirstName() {
    return this.firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public int getId() {
    return this.id;
  }

  public ArrayList<Double> getGrades() {
    return this.grades;
  }

}
