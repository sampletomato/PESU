interface Battery {
    public void batteryStatus(); // Abstract Method
}
class Car {
    private String brand, model, fuelType;
    Car(String brand, String model, String fuelType) {
        this.model = model; this.brand = brand;
        this.fuelType = fuelType;
    }
    public void display() {
        System.out.println("Class Car");
        System.out.println(brand + "\n" + model + "\n" + fuelType);
    }
}

class ElectricCar extends Car implements Battery {
    private String driveMode; private int range, batteryCapacity;
    ElectricCar(String brand, String model, 
        int range, String driveMode, int batteryCapacity) {
            super(brand, model, "Electicity");
            this.driveMode = driveMode;
            this.batteryCapacity = batteryCapacity;this.range = range;
        }
        public void batteryStatus() {System.out.println("Range: " + range);}
        public void display() {
            System.out.println("Battery Capacity: " + batteryCapacity);
            System.out.println("Range: " + range);
            System.out.println("Mode: " + driveMode);
            super.display();
        }
}

public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        ElectricCar ev = new ElectricCar("Brand", "Model", 
        150, "City", 500);
        ev.batteryStatus();
        ev.display();
    }    
}
