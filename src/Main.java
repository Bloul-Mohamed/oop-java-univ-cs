import java.util.Scanner;
import labone.*;
import labtwo.*;

public class Main {
  public static void main(String[] args) {
    // test the class Student
    Student student1 = new Student("Ali", 1, 3);
    Student student2 = new Student("Mohmaed", 2, 3.5);
    System.out.println(Student.compireStudentGrade(student1, student2));

    System.out.println("---------------------------------");

    System.out.println("Student 1 Info:");
    student1.displayStudentInfo(student1);

    System.out.println("---------------------------------");
    System.out.println("Student 2 Info:");
    student2.displayStudentInfo(student2);

    System.out.println("---------------------------------");
    // test the class Chrono
    Chrono chrono = new Chrono(1, 30, 45);
    chrono.display();
    chrono.advance(30);
    chrono.display();
    chrono.advance(70);
    chrono.display();

    System.out.println("---------------------------------");
    // test the class Employee
    Employee employeeLevelOne = new Employee();
    Employee employeeLevelTwo = new Employee("Ali", "Mohamed");
    Employee employeeLevelThree = new Employee("Ahmed", "Mohamed", "Designer");

    Employee employeeLevelFour = new Employee("Ahmed", "Mohamed", "Designer", 5000);
    employeeLevelOne.displayDetails();
    System.out.println("---------------------------------");
    employeeLevelTwo.displayDetails();
    System.out.println("---------------------------------");
    employeeLevelThree.displayDetails();
    System.out.println("---------------------------------");
    employeeLevelFour.displayDetails();

    System.out.println("---------------------------------");
    // test the class Point2D
    Point2D point1 = new Point2D(1, 2);
    Point2D point2 = new Point2D(3, 4);
    System.out.println(point1.toString());
    System.out.println(point2.toString());
    System.out.println(point1.distance(point2));

    System.out.println("---------------------------------");
    // test the class Player
    Player player = new Player();
    player.displayStatus();
    player.injure();
    player.displayStatus();
    player.injure();
    player.displayStatus();
    player.heal();
    player.displayStatus();
    player.injure();
    player.displayStatus();
    player.injure();
    player.displayStatus();
  }
}
