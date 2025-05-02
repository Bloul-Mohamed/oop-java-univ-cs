package labthree;

/**
 * Employee
 */
public class Employee {
  private String name;
  private int id;
  private int countId = 0;
  private final Double baseSalary = 5000.0;

  // Constructor
  public Employee() {
    this.name = "Unknown";
    this.id = ++countId;
  }

  public Employee(String name) {
    this.name = name;
    this.id = ++countId;
  }

  public void displayInfo() {
    System.out.println("Employee Name: " + this.name);
    System.out.println("Employee ID: " + this.id);
    System.out.println("Base Salary: " + this.baseSalary);
  }

  public Double calculateSalary() {
    return baseSalary;
  }
}
