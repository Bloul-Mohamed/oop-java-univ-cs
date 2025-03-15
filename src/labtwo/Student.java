package labtwo;

/**
 * Student
 */
public class Student {
  private String name;
  private int classGroup;
  private double grade;

  public Student() {
    this.name = "Unknown";
    this.classGroup = 0;
    this.grade = 0.0;
  }

  public Student(String name, int classGroup, double grade) {
    this.name = name;
    this.classGroup = classGroup;
    this.grade = grade;
  }

  public static String compireStudentGrade(Student student1, Student student2) {

    if (student1.grade > student2.grade) {
      return student1.getName();
    } else if (student1.grade < student2.grade) {
      return student2.getName();
    } else {
      return "Both students have the same grade";
    }
  }

  public void displayStudentInfo(Student student) {
    System.out.println("Name: " + student.name);
    System.out.println("Class Group: " + student.classGroup);
    System.out.println("Grade: " + student.grade);
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getClassGroup() {
    return this.classGroup;
  }

  public void setClassGroup(int classGroup) {
    this.classGroup = classGroup;
  }

  public double getGrade() {
    return this.grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

}
