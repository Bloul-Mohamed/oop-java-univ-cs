package BuildRobotLogic;

/**
 * HelperMethod
 */
public class HelperMethod {

  public boolean IsPositiveNumber(double n) {
    if (n >= 0) {
      return true;
    } else {
      return false;
    }
  }

  public boolean IsEqual(double n1, double n2) {
    if (n1 == n2) {
      return true;
    } else {
      return false;
    }
  }

  public boolean IsLowBattery(double battery) {
    if (battery <= 5) {
      return true;
    } else {
      return false;
    }
  }

  public boolean IsBothEqualZero(double n1, double n2) {
    if (n1 == n2 && n1 == 0) {
      return true;
    } else {
      return false;
    }
  }

}
