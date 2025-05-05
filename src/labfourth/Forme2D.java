package labfourth;

import java.awt.Color;

/**
 * Forme2D
 */
public class Forme2D extends ColorInfo {
  protected Color color;

  public Forme2D() {
    this.color = Color.BLACK;
  }

  public Forme2D(Color color) {
    this.color = color;
  }

  public String getColor() {
    return getColorName(color);
  }

  public void setColor(Color color) {
    this.color = color;
  }

  // main method for logic testing
  public Double perimeter() {
    return 0.0;
  }

  public Double area() {
    return 0.0;
  }
}
