package labfourth;

import java.awt.Color;

// File: ColorExample.java

import java.awt.Color;

/**
 * Disque
 */
public class Disque extends Forme2D {
  private double radius;

  public Disque() {
    super();
    this.radius = 0.0;
  }

  public Disque(double radius, Color color) {
    super(color);
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  @Override
  public void setColor(Color color) {
    this.color = color;

  }

  @Override
  public Double perimeter() {
    return (2 * Math.PI * radius);
  }

  @Override
  public Double area() {
    return (Math.PI * Math.pow(radius, 2));
  }

}
