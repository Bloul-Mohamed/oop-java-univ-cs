package labtwo;

import java.util.ArrayList;

/**
 * Scolarite
 */
public class Scolarite {

  ArrayList<StudentUnique> students;

  public Scolarite() {
    this.students = new ArrayList<StudentUnique>();
  }

  public int nbStudents() {
    return students.size();
  }

  public void displayAllStudents(double threshold) {
    for (StudentUnique student : students) {
      if (student.calculateAverage() > threshold) {
        System.out.println("Student Name: " + student.firstName + " " + student.lastName);
        System.out.println("Average: " + student.calculateAverage());
        System.out.println("----------------");
      }
    }
  }

  public void setStudent(StudentUnique student) {
    students.add(student);

  }

  public void getStudent(int id) {
    for (StudentUnique student : students) {
      if (student.id == id) {
        System.out.println("Student Name: " + student.firstName + " " + student.lastName);
      }
    }
    System.out.println("Student not found");
  }

}
