package BuildRobotLogic;

/**
 * RobotNavigation
 */
public interface RobotNavigation {
  void moveToDestination(int x, int y);

  String getCurrentPosition();

  double getPositionX();

  double getPositionY();
}
