// File: Main.java

import labtwo.*;

public class Main {
  public static void main(String[] args) {
    Scolarite scolarite = new Scolarite();
    StudentUnique student1 = new StudentUnique("Ali", "Ahmed");
    student1.setGrade(85.0);
    student1.setGrade(90.0);
    student1.setGrade(60.0);
    scolarite.setStudent(student1);

    StudentUnique student2 = new StudentUnique("Mohamed", "Ridha");
    student2.setGrade(75.0);
    student2.setGrade(80.0);
    student2.setGrade(45.0);
    scolarite.setStudent(student2);

    System.out.println("Number of students: " + scolarite.nbStudents());
    System.out.println("Students with average above 80:");
    scolarite.displayAllStudents(60.0);
  }
}
