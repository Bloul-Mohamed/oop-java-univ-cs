package labAbstract;

import java.awt.Color;
import labfourth.ColorInfo;

import java.awt.Color;

/**
 * Forme2D
 */
public abstract class Forme2D extends ColorInfo {

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

  protected abstract double area();

  protected abstract double perimetre();

}
