//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Class definition
public class Car {
    // Instance variables (attributes)
    String model;
    int year;

    // Constructor method
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Method
    public void drive() {
        System.out.println(model + " is driving");
    }
}


public class Main {
    public static void main(String[] args) {
        // Create objects (instances)
        Car myCar = new Car("Toyota", 2023);
        myCar.drive(); // Output: Toyota is driving
    }
}