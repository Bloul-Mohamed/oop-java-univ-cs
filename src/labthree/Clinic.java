package labthree;

import java.util.ArrayList;

/**
 * Clinic
 */
public class Clinic {

  private ArrayList<Employee> employees;

  public Clinic() {
    this.employees = new ArrayList<>();
  }

  public void addEmployee(Employee employee) {
    this.employees.add(employee);
  }

  public void showEmployees() {
    for (Employee employee : employees) {
      employee.displayInfo();
      System.out.println("Salary: " + employee.calculateSalary());
      System.out.println("------------------------------");
    }
  }

  public Double calculateMonthlyPayroll() {
    Double total = 0.0;
    for (Employee employee : employees) {
      total += employee.calculateSalary();
    }
    return total;
  }
}
