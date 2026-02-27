class Vehicle {
    // Parent Class
    private String brand, model;
    private int noOfPassengers, engineCc, price;
    // Constructor
    Vehicle(String brand, String model, int noOfPassengers, 
        int engineCc, int price) {
            this.brand = brand; this.model = model;
            this.noOfPassengers = noOfPassengers;
            this.engineCc = engineCc; this.price = price;
        }
    public void display() {
        System.out.println("Base Class Function");
        System.out.println(brand); System.out.println(model);
        System.out.println(noOfPassengers);
        System.out.println(engineCc); System.out.println(price);
    }
}

class Bike extends Vehicle {
    Bike(String brand, String model, int noOfPassengers, 
        int engineCc, int price) {
            super(brand, model, noOfPassengers, engineCc, price);
        }
    public void displayBike() {
        System.out.println("From Bike, calling super class method");
        super.display();
    }
}

class Bus extends Vehicle {
    private String fuelType; // Additional Property
    Bus(String brand, String model, int noOfPassengers, 
        int engineCc, int price, String fuelType) {
            super(brand, model, noOfPassengers, engineCc, price);
            // Call Super class Constructor
            this.fuelType = fuelType; // Init additional property locally
        }
    public void displayBus() {
        System.out.println("Calling from Bus to Vehicle");
        super.display();
        System.out.println(fuelType); // Addl. Property
    }
}

class Car extends Vehicle {
    private int doorCount, bootspace;
    private boolean isManual;
    Car(String brand, String model, int noOfPassengers, 
        int engineCc, int price, int doorCount, int bootspace, boolean isManual) {
            super(brand, model, noOfPassengers, engineCc, price);
            // Call Super class Constructor
            this.doorCount = doorCount; this.bootspace = bootspace;
            this.isManual = isManual;
        }
    public void displayCar() {
        System.out.println("Calling from Car to Vehicle");
        super.display();
        System.out.println(doorCount);System.out.println(bootspace);
        System.out.println(isManual);
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Bike b = new Bike("Brand", "Model", 
        2, 125, 125000);
        Car c = new Car("Brand", "Model", 
        5, 1199, 800000, 
        5, 280, true);
        Bus bus = new Bus("Brand", "Model", 50, 
        9999, 2500000, "Diesel");
        b.displayBike();c.displayCar();bus.displayBus();
    }
}
