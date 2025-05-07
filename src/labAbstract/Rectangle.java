package labAbstract;

import java.awt.Color;

/**
 * Rectangle
 */
public class Rectangle extends Forme2D {

  private double length;
  private double width;

  public Rectangle(double length, double width) {
    super();
    this.length = length;
    this.width = width;
  }

  public Rectangle(double length, double width, Color color) {
    super(color);
    this.length = length;
    this.width = width;
  }

  @Override
  public double area() {
    return length * width;
  }

  @Override
  public double perimetre() {
    return 2 * (length + width);
  }

}
