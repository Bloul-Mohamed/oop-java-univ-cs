package labthree;

/**
 * Administrator
 */
public class Administrator extends Employee {
  private String department;

  private final Double monthlyBonus = 500.0;

  // Constructor
  public Administrator() {
    super();
    this.department = "Unknown";
  }

  public Administrator(String name, String department) {
    super(name);
    this.department = department;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Department: " + this.department);
  }

  @Override
  public Double calculateSalary() {
    Double baseSalary = super.calculateSalary();
    return baseSalary + monthlyBonus;
  }

}
