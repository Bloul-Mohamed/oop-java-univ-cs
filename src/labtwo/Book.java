
package labtwo;

/**
 * Book
 */
public class Book {
  String title;
  String author;
  int condition;

  // Constructor
  public Book() {
    this.title = "Unknown Title";
    this.author = "Unknown Author";
    this.condition = 5; // Default condition
  }

  public Book(String title, String author, int condition) {
    this.title = title;
    this.author = author;
    this.condition = condition;
  }

  // Method
  public void description() {
    System.out.println("Title: " + this.title);
    System.out.println("Author: " + this.author);
    System.out.println("Condition: " + this.condition);
  }

  public void degrade() {
    if (this.condition >= 1) {
      this.condition--;
    } else {
      System.out.println("Condition is very low .0.");
    }

  }

  public void degrade(int degrade) {
    if (this.condition >= 1) {
      this.condition = this.condition - degrade;
    } else {
      System.out.println("Condition is very low .0.");
    }
  }

  // Getters and Setters
  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return this.author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public int getCondition() {
    return this.condition;
  }

  public void setCondition(int condition) {
    this.condition = condition;
  }

  public void setCondition() {
    this.condition = 5; // Default condition
  }

}
