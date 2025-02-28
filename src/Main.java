public class Main {
  public static void main(String[] args) {
    Average avg = new Average();

    avg.InsertNote(15.5);
    avg.InsertNote(18);
    avg.InsertNote(12.5);

    System.out.println("Average: " + avg.calculateAverage());
  }
}
