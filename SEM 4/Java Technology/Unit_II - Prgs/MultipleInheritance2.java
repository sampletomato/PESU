interface Car {
    public void startCar(); public void stopCar();
}
interface Battery {public void chargeBattery();}
interface GPS {public void whereTo(String dest, int distance);}
class ElectricCar implements Car, Battery, GPS {
    private String brand, model; private int batteryLevel;
    ElectricCar(String brand, String model, int batteryLevel) {
        this.batteryLevel = batteryLevel; this.brand = brand; this.model = model;
    }
    public void startCar() {
        if(batteryLevel > 0) System.out.println("Started");
        else System.out.println("Can't start");
    }
    public void stopCar() {System.out.println("Stopped");}
    public void chargeBattery() {
        if(batteryLevel == 100) System.out.println("Already charged");
        else {
            batteryLevel = 100;
            System.out.println("Charged");
        }
    }
    public void whereTo(String dest, int distance) {
        int batteryNeeded = distance / 5;
        if(batteryNeeded <= batteryLevel) { 
            System.out.println("Driving to " + dest);
            batteryLevel -= batteryNeeded;
        }
        else if(batteryLevel == 0 || batteryNeeded > batteryLevel) 
            System.out.println("Not enough charge");
    }
    public void drive() {
        if(batteryLevel > 0) System.out.println("Driving");
        else System.out.println("Can't drive");
    }
}
public class MultipleInheritance2 {
    public static void main(String[] args) {
        ElectricCar c = new ElectricCar("Some brand", "Some model", 
        100);
        c.startCar();
        c.whereTo("Somewhere", 100);
        c.drive();
        c.chargeBattery();
        c.whereTo("Somewhere else", 1000);
        c.drive();
        c.whereTo("Another place", 500);
        c.drive();
    }
}
