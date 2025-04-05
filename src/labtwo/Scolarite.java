package labtwo;

import java.util.ArrayList;

/**
 * Scolarite
 */
public class Scolarite {

  ArrayList<StudentUnique> students;

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

  public StudentUnique getStudent(int id) {
    for (StudentUnique student : students) {
      if (student.id == id) {
        return student;
      }
    }
    return null; // Student not found
  }

}
