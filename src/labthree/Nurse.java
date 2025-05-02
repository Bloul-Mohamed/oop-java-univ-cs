package labthree;

/**
 * Nurse
 */
public class Nurse extends Employee {
  private String department;
  private boolean isNightShift;

  // Constructor
  public Nurse() {
    super();
    this.department = "Unknown";
    this.isNightShift = false;
  }

  public Nurse(String name, String department, boolean isNightShift) {
    super(name);
    this.department = department;
    this.isNightShift = isNightShift;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Department: " + this.department);
    System.out.println("Night Shift: " + (this.isNightShift ? "Yes" : "No"));
  }

  @Override
  public Double calculateSalary() {
    Double baseSalary = super.calculateSalary();
    if (this.isNightShift) {
      return baseSalary + 1000.0;
    }
    return baseSalary;
  }

}
