package labAbstract;
import java.awt.Color;

/**
 * Circle
 */
public class Circle extends Forme2D {

  private double radius;

  public Circle(double radius) {
    super();
    this.radius = radius;
  }

  public Circle(double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return Math.PI * radius * radius;
  }

  @Override
  public double perimetre() {
    return 2 * Math.PI * radius;
  }

}
