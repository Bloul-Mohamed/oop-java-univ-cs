package labtwo;

import java.util.ArrayList;

public class Library {
  // Initialize the list when declaring it
  ArrayList<Book> books = new ArrayList<Book>();

  // Method
  public void addBook(Book book) {
    if (!books.contains(book)) {
      books.add(book);
    } else {
      System.out.println("Book already exists in the library.");
    }
  }

  public void removeDamagedBook() {
    // remove books with condition zero
    boolean status = false;
    for (int i = books.size() - 1; i >= 0; i--) {
      if (books.get(i).getCondition() == 0) {
        System.out.println("Removed damaged book: " + books.get(i));
        books.remove(i);
      }
    }
    if (!status) {

      System.out.println("No damaged books found.");
    }
  }

  public void inventory() {
    System.out.println("Library Inventory: ");
    if (books.isEmpty()) {
      System.out.println("No books in the library.");
    } else {
      for (Book book : books) {
        book.description();
        System.out.println("-------------------");
      }
    }
  }
}
