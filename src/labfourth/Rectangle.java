package labfourth;

import java.awt.Color;

/**
 * Rectangle
 */
public class Rectangle extends Forme2D {
  private double length;
  private double width;

  public Rectangle() {
    super();
    this.length = 0.0;
    this.width = 0.0;
  }

  public Rectangle(double length, double width, Color color) {
    super(color);
    this.length = length;
    this.width = width;
  }

  public double getLength() {
    return length;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  @Override
  public void setColor(Color color) {
    super.setColor(color);
  }

  @Override
  public Double perimeter() {
    return (2 * (length + width));
  }

  @Override
  public Double area() {
    return (length * width);
  }

}
