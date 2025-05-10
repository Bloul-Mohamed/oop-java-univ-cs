package labAbstract;

import java.awt.Color;

/**
 * Square
 */
public class Square extends Forme2D {

  private double side;

  public Square(double side) {
    super();
    this.side = side;
  }

  public Square(double side, Color color) {
    super(color);
    this.side = side;
  }

  @Override
  public double area() {
    return side * side;
  }

  @Override
  public double perimetre() {
    return 4 * side;
  }

}
