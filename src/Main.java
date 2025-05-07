
// File: Main.java
// package labAbstract;
import labAbstract.*;
import labAbstract.*;
import java.awt.Color;

public class Main {
  public static void main(String[] args) {

    // Create a rectangle and a disk
    Rectangle rectangle = new Rectangle(5, 10, Color.RED);
    Disque disque = new Disque(7, Color.BLUE);

    // Print their areas and perimeters
    System.out.println("Rectangle Area: " + rectangle.area());
    System.out.println("Rectangle Perimeter: " + rectangle.perimetre());
    System.out.println("Disk Area: " + disque.area());
    System.out.println("Disk Perimeter: " + disque.perimetre());

    // Print their colors
    System.out.println("Rectangle Color: " + rectangle.getColor());
    System.out.println("Disk Color: " + disque.getColor());
  }
}
