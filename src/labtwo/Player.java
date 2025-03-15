package labtwo;

/**
 * Player
 */
public class Player {
  /*
   * 
   * Define a class Player with attributes energy (default 3) and alive (default
   * true). Implement:
   * 1. injure(): Decreases energy by 1. If energy reaches 0, alive becomes false
   * permanently.
   * 2. heal(): Increases energy by 1 but has no effect if alive is false.
   * 3. displayStatus(): Prints the player’s current energy and status
   */

  private int energy;
  private boolean alive;

  public Player() {
    this.energy = 3;
    this.alive = true;
  }

  public void injure() {
    if (this.energy > 0) {
      this.energy--;
      if (this.energy == 0) {
        this.alive = false;
      }
    }
  }

  public void heal() {
    if (this.alive) {
      this.energy++;
    }
  }

  public void displayStatus() {
    System.out.println("Energy: " + this.energy);
    System.out.println("Status: " + (this.alive ? "Alive" : "Dead"));
  }

  public int getEnergy() {
    return this.energy;
  }

  public void setEnergy(int energy) {
    this.energy = energy;
  }

  public boolean isAlive() {
    return this.alive;
  }

  public void setAlive(boolean alive) {
    this.alive = alive;
  }

}
