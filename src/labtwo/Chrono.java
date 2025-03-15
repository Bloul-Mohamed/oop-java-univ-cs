package labtwo;

/**
 * Chrono
 */
public class Chrono {
  /*
   * Design a class Chrono with attributes hours, minutes, and seconds. Imple-
   * ment:
   * 1. display(): Prints the current time in the format hh:mm:ss.
   * 2. advance(int s): Advances time by s seconds, adjusting minutes and
   * hours accordingly.
   */
  private int hours;
  private int minutes;
  private int seconds;

  public Chrono() {
    this.hours = 0;
    this.minutes = 0;
    this.seconds = 0;
  }

  public Chrono(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
  }

  public void display() {
    System.out.println("Time: " + this.hours + ":" + this.minutes + ":" + this.seconds);
  }

  public void advance(int s) {
    this.seconds += s;
    if (this.seconds >= 60) {
      this.minutes += this.seconds / 60;
      this.seconds = this.seconds % 60;
    }
    if (this.minutes >= 60) {
      this.hours += this.minutes / 60;
      this.minutes = this.minutes % 60;
    }
  }

  public int getHours() {
    return this.hours;
  }

  public void setHours(int hours) {
    this.hours = hours;
  }

  public int getMinutes() {
    return this.minutes;
  }

  public void setMinutes(int minutes) {
    this.minutes = minutes;
  }

  public int getSeconds() {
    return this.seconds;
  }

  public void setSeconds(int seconds) {
    this.seconds = seconds;
  }
}
