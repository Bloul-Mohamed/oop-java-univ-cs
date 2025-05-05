
// File: Main.java
import java.awt.Color;
import labfourth.*;

public class Main {
  public static void main(String[] args) {
    // Create a rectangle and a disk
    Rectangle rectangle = new Rectangle(5.22, 3.0, Color.RED);
    Disque disk = new Disque(2.0, Color.BLUE);

    System.out.println("Color of Rectangle: " + rectangle.getColor());
    // Print the area and perimeter of the rectangle
    System.out.printf("Rectangle Area: %.2f%n" + rectangle.area());
    System.out.printf("Rectangle Perimeter: %.2f%n" + rectangle.perimeter());

    // Print the area and perimeter of the disk
    System.out.printf("Disk Area:  %.2f%n" + disk.area());
    System.out.printf("Disk Perimeter:  %.2f%n" + disk.perimeter());
  }
}
