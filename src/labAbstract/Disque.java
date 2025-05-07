package labAbstract;

import java.awt.Color;

/**
 * Disque
 */
public class Disque extends Forme2D {

  private double rayon;

  public Disque(double rayon) {
    this.rayon = rayon;
  }

  public Disque(double rayon, Color color) {
    super(color);
    this.rayon = rayon;
  }

  @Override
  public double area() {
    return Math.PI * rayon * rayon;
  }

  @Override
  public double perimetre() {
    return 2 * Math.PI * rayon;
  }
}
