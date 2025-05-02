package labthree;

/**
 * Doctor
 */
public class Doctor extends Employee {
  private String specialty;
  private int numberOfConsultations = 0;

  // Constructor
  public Doctor() {
    super();
    this.specialty = "Unknown";
    this.numberOfConsultations = 0;
  }

  public Doctor(String name, String specialty, int numberOfConsultations) {
    super(name);
    this.specialty = specialty;
    this.numberOfConsultations = numberOfConsultations;
  }

  @Override
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Specialty: " + this.specialty);
    System.out.println("Number of Consultations: " + this.numberOfConsultations);
  }

  @Override
  public Double calculateSalary() {
    Double baseSalary = super.calculateSalary();
    return baseSalary + (this.numberOfConsultations * 50.0);
  }

}
