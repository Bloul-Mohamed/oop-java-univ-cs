package tests;

/**
 * Employee
 */
public class Employee {
  private String name;
  private Integer age;
  private Double salary;

  public Employee() {
    this.name = "Unknow";
    this.age = 0;
    this.salary = 0.0;

  }

  public Employee(String name) {
    this.name = name;
    this.age = 0;
    this.salary = 0.0;

  }

  public Employee(String name, Integer age) {
    this.name = name;
    this.age = age;
    this.salary = 0.0;

  }

  public Employee(String name, Integer age, Double salary) {
    this.name = name;
    this.age = age;
    this.salary = salary;
  }

  public void display() {
    System.out.println("Name: " + name);
    System.out.println("Age: " + age);
    System.out.println("Salary: " + salary);
  }

  public Double calculateBonus() {
    if (this.salary > 5000) {
      return salary * 0.1;

    }
    return salary * 0.05;
  }

  public Double calculateSpecialBonus(boolean performance, Integer seniority) {
    if (performance && seniority > 5) {
      return salary * 0.15;
    } else if (performance || seniority > 5) {
      return salary * 0.1;
    }
    return salary;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

}
