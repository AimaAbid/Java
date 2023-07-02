// Abstract class representing a Vehicle
abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method to start the vehicle
    public abstract void start();

    // Common method to display the brand of the vehicle
    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}

// Interface representing a MusicPlayer
interface MusicPlayer {
    void playMusic();
}

// Concrete class Car that extends the Vehicle abstract class and implements the
// MusicPlayer interface
class Car extends Vehicle implements MusicPlayer {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println("Starting the car...");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music in the car...");
    }
}

// Concrete class Bicycle that extends the Vehicle abstract class
class Bicycle extends Vehicle {
    public Bicycle(String brand) {
        super(brand);
    }

    public void start() {
        System.out.println("Starting to pedal the bicycle...");
    }
}

// Main class
public class Main2 {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        car.displayBrand();
        car.start();
        car.playMusic();

        Bicycle bicycle = new Bicycle("Giant");
        bicycle.displayBrand();
        bicycle.start();
    }
}
