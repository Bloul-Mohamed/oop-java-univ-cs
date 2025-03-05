package labone;

/**
 * Factorial
 */
// Factorial Using Recersion
public class Factorial {
  public static int factorial(int n) {
    if (n == 1 || n == 0) {
      return 1;
    } else {
      return n * factorial(n - 1);
    }
  }
}
