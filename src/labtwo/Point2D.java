package labtwo;

/**
 * Point2D
 */
public class Point2D {

  /*
   * Create a class Point2D with attributes x and y. Implement:
   * 1. Default and parameterized constructors.
   * 2. Getters (getX(), getY()) and setters (setX(double x), setY(double y)).
   * 3. toString(): Returns a formatted string "(x, y)".
   * 4. distance(Point2D p): Computes the Euclidean distance between two
   * points.
   */
  private double x;
  private double y;

  public Point2D() {
    this.x = 0;
    this.y = 0;
  }

  public Point2D(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public double getX() {
    return this.x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return this.y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }

  public double distance(Point2D p) {
    return Math.sqrt(Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2));
  }

}
