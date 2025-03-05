package labone;

import labone.*;
import java.util.Scanner;

/**
 * FullProgram
 */
public class FullProgram {

  public static void run() {

    Scanner sc = new java.util.Scanner(System.in);
    while (true) {
      System.out.println("1. Compute Factorial \n2. Compute Fibonacci \n3. Check Prime \n4. Compute Power \n5. Exit");
      System.out.print("Enter your choice: ");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Enter a number: ");
          int n = sc.nextInt();
          System.out.println("\u001B[32m" + "Factorial of " + n + " is " + Factorial.factorial(n) + "\u001B[0m");

          break;
        case 2:
          System.out.print("Enter a number: ");
          n = sc.nextInt();
          System.out.println("\u001B[32m" + "Fibonacci of " + n + " is " + Fibonacci.fibonacci(n) + "\u001B[0m");
          break;
        case 3:
          System.out.print("Enter a number: ");
          n = sc.nextInt();
          System.out.println("\u001B[32m" + n + " is " + (IsPrime.isPrime(n) ? "Prime" : "Not Prime") + "\u001B[0m");
          break;
        case 4:
          System.out.print("Enter base: ");
          int base = sc.nextInt();
          System.out.print("Enter exponent: ");
          int exponent = sc.nextInt();

          System.out.println("\u001B[32m" + base + " raised to the power of " + exponent + " is "
              + Power.power(base, exponent) + "\u001B[0m");
          break;
        case 5:
          System.exit(0);
        default:

          System.out.println("\u001B[31m" + "Invalid choice" + "\u001B[0m");
      }
    }
  }
}
