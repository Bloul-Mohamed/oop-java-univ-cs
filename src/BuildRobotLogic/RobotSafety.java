package BuildRobotLogic;

/**
 * RobotSafety
 */
public interface RobotSafety {
  double maxSpeed = 15.0;

  void changeSpeed(double New_vitD, double New_vitG);

  void changeBattery();

}
