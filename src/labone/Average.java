
public class Average {
  private String nom;
  private int age;
  private double totalNote;
  private int nombreDeNotes;
  private static int nextId = 0;
  private int saveId;
  private double average;

  // No parameter constructor
  public Average() {
    this.nom = "Unknown";
    this.age = 0;
    nextId++;
    saveId = nextId;
  }

  // Parameterized constructor
  public Average(String nom, int age) {
    this.nom = nom;
    this.age = age;
    nextId++;
    saveId = nextId;
  }

  // Method to insert a note (grade)
  public void insertNote(double note) {
    this.totalNote += note;
    this.nombreDeNotes++;
  }

  // Method to calculate and display average
  public void calculateAverage() {
    average = totalNote / nombreDeNotes;
  }

  public void displayInformation() {
    System.out.println("Student " + saveId);
    System.out.println("Name: " + nom);
    System.out.println("Age: " + age);
    System.out.printf("Average: %.2f%n", average);
    System.out.println("\n------------------------");
  }
}
