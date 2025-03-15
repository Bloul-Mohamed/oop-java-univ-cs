package labtwo;

/**
 * Employee
 */
public class Employee {

  /*
   * Construct a class Employee with attributes: firstName, lastName, position,
   * and salary. Implement:
   * 1. Four constructors for different levels of initialization. 2.
   * displayFullName(): Displays the full name.
   * 1
   * 3. displayDetails(): Displays full name, position, and salary.¨
   */
  private String firstName;
  private String lastName;
  private String position;
  private double salary;

  public Employee() {
    this.firstName = "Unknown";
    this.lastName = "Unknown";
    this.position = "Unknown";
    this.salary = 0;
  }

  public Employee(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = "Unknown";
    this.salary = 0;
  }

  public Employee(String firstName, String lastName, String position) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.salary = 0;
  }

  public Employee(String firstName, String lastName, String position, double salary) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.position = position;
    this.salary = salary;
  }

  public void displayFullName() {
    System.out.println("Full Name: " + this.firstName + " " + this.lastName);
  }

  public void displayDetails() {
    System.out.println("Full Name: " + this.firstName + " " + this.lastName);
    System.out.println("Position: " + this.position);
    System.out.println("Salary: " + this.salary);
  }

  public String getFirstName() {
    return this.firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return this.lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPosition() {
    return this.position;
  }

  public void setPosition(String position) {
    this.position = position;
  }

  public double getSalary() {
    return this.salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

}
