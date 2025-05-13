// Package: com.example.RobotSafety

package BuildRobotLogic;

/**
 * Robot
 */
public class Robot extends HelperMethod implements RobotMovement, RobotNavigation, RobotSafety {
  private double vitD;
  private double vitG;
  private double x;
  private double y;
  private double battery;

  public Robot() {
    this.vitD = 0;
    this.vitG = 0;
    this.x = 0;
    this.y = 0;
    this.battery = 100;
  }

  public Robot(double vitD, double vitG) {
    this.vitD = vitD;
    this.vitG = vitG;
    this.x = 0;
    this.y = 0;
    this.battery = 100;
  }

  @Override
  public void Advance(double vitD, double vitG) {
    if (IsLowBattery(battery)) {
      System.out.print("Battery is low, please charge it");
      return;
    } else {

      if (IsEqual(vitD, vitG)) {
        if (IsPositiveNumber(vitD)) {
          this.vitD = Math.min(vitD, maxSpeed);
          this.vitG = Math.min(vitG, maxSpeed);
          this.x += vitD;
          this.y += vitG;
          this.battery -= (vitD + vitG) / 4;
        } else {
          this.vitD = Math.min(vitD, maxSpeed);
          this.vitG = Math.min(vitG, maxSpeed);
          this.x -= vitD;
          this.y -= vitG;
          this.battery -= Math.abs(vitD + vitG) / 4;
        }
      } else {
        if (IsPositiveNumber(vitD) && IsPositiveNumber(vitG)) {
          if (vitD > vitG) {
            this.vitD = Math.min(vitD, maxSpeed);
            this.vitG = Math.min(vitG, maxSpeed);
            this.x += vitD;
            this.y += vitG;
            this.battery -= (vitD + vitG) / 4;

          } else {
            this.vitD = Math.min(vitD, maxSpeed);
            this.vitG = Math.min(vitG, maxSpeed);
            this.x += vitD;
            this.y += vitG;
            this.battery -= (vitD + vitG) / 4;
          }
        } else {
          if (Math.abs(vitD) > Math.abs(vitG)) {
            this.vitD = Math.min(vitD, maxSpeed);
            this.vitG = Math.min(vitG, maxSpeed);
            this.x += vitD;
            this.y += vitG;
            this.battery -= (vitD + vitG) / 4;

          } else {
            this.vitD = Math.min(vitD, maxSpeed);
            this.vitG = Math.min(vitG, maxSpeed);
            this.x -= vitD;
            this.y -= vitG;
            this.battery -= Math.abs(vitD + vitG) / 4;
          }
        }
      }

    }

  }

  @Override
  public void Break() {
    if (IsBothEqualZero(vitD, vitG)) {
      System.out.print("Robot is already stopped");
    } else {
      this.vitD = 0;
      this.vitG = 0;
      System.out.print("Robot is stopped");
    }
  }

  @Override
  public void changeSpeed(double New_vitD, double New_vitG) {
    this.vitD = New_vitD;
    this.vitG = New_vitG;
  }

  @Override
  public void moveToDestination(int x, int y) {
    if (IsLowBattery(battery)) {
      System.out.print("Battery is low, please charge it");

    } else {
      if (IsEqual(this.x, x) && IsEqual(this.y, y)) {
        System.out.print("Robot is already at the destination");
      } else {
        this.x = x;
        this.y = y;
        System.out.print("Robot moved to destination");
        battery -= Math.abs(this.x - x) / 4;
      }

    }
  }

  @Override
  public void changeBattery() {
    if (IsLowBattery(battery)) {
      battery = 100;
      System.out.print("Battery changed successfully");
    } else {
      System.out.print("Battery is not low");
    }
  }

  @Override
  public String getCurrentPosition() {
    return "Current Position: (" + x + ", " + y + ")";
  }

  @Override
  public double getPositionX() {
    return x;
  }

  @Override
  public double getPositionY() {
    return y;
  }
}
