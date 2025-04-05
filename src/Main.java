import labtwo.*;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Library library = new Library();

    boolean running = true;
    while (running) {
      // Display menu
      System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
      System.out.println("1. Add a book");
      System.out.println("2. Remove damaged books");
      System.out.println("3. List all books");
      System.out.println("4. Exit");
      System.out.print("Enter your choice (1-4): ");

      // Get user choice
      int choice = 0;
      try {
        choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline
      } catch (Exception e) {
        scanner.nextLine(); // Clear buffer on error
        System.out.println("Please enter a valid number.");
        continue;
      }

      // Process the choice
      switch (choice) {
        case 1:
          System.out.print("Enter book title: ");
          String title = scanner.nextLine();
          System.out.print("Enter book author: ");
          String author = scanner.nextLine();
          System.out.print("Enter book condition (0-5, where 0 is damaged): ");
          int condition = scanner.nextInt();
          scanner.nextLine(); // Consume newline
          Book newBook = new Book(title, author, condition);
          library.addBook(newBook);
          System.out.println("Book added: " + newBook.getTitle());
          break;
        case 2:
          library.removeDamagedBook();
          break;
        case 3:
          library.inventory();
          break;
        case 4:
          running = false;
          System.out.println("Exiting program. Goodbye!");
          break;
        default:
          System.out.println("Invalid choice. Please select a number between 1 and 4.");
      }
    }

    scanner.close();
  }
}
