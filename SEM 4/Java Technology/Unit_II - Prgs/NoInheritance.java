class Bike {
    private String brand, model;
    private int noOfPassengers, engineCc, price;
    // Getters
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public int getNoOfPassengers() {return noOfPassengers;}
    public int getEngineCc() {return engineCc;}
    public int getPrice() {return price;}
    // Setters
    public void setBrand(String brand) {this.brand = brand;}
    public void setModel(String model) {this.model = model;}
    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }
    public void setEngineCc(int engineCc) {this.engineCc = engineCc;}
    public void setPrice(int price) {this.price = price;}
    // Constructor
    Bike(String brand, String model, int noOfPassengers, int engineCc, int price) {
        this.setBrand(brand); this.setModel(model);
        this.setNoOfPassengers(noOfPassengers);
        this.setEngineCc(engineCc); this.setPrice(price);
    }
}

class Car {
    private String brand, model;
    private int noOfPassengers, engineCc, price, doorCount, bootspace;
    private boolean isManual;
    // Getters
    public String getBrand() {return brand;}
    public String getModel() {return model;}
    public int getNoOfPassengers() {return noOfPassengers;}
    public int getEngineCc() {return engineCc;}
    public int getPrice() {return price;}
    public int getDoorCount() {return doorCount;}
    public int getBootspace() {return bootspace;}
    public boolean getIsManual() {return isManual;}
    // Setters 
    public void setBrand(String brand) {this.brand = brand;}
    public void setModel(String model) {this.model = model;}
    public void setNoOfPassengers(int noOfPassengers) {
        this.noOfPassengers = noOfPassengers;
    }
    public void setEngineCc(int engineCc) {this.engineCc = engineCc;}
    public void setPrice(int price) {this.price = price;}
    public void setDoorCount(int doorCount) {this.doorCount = doorCount;}
    public void setBootspace(int bootspace) {this.bootspace = bootspace;}
    public void setIsManual(boolean isManual) {this.isManual = isManual;}
    // Constructor
    Car(String brand, String model, int noOfPassengers, int engineCc, int price
        , int doorCount, int bootspace, boolean isManual
    ) {
        this.setBrand(brand); this.setModel(model);
        this.setNoOfPassengers(noOfPassengers);
        this.setEngineCc(engineCc); this.setPrice(price);
        this.setDoorCount(doorCount); this.setBootspace(bootspace);
        this.setIsManual(isManual);
    }
}

public class NoInheritance {
    public static void main(String[] args) {
        Car c = new Car("Brand", "Model", 
        5, 1199, 800000, 
        5, 280, true);
        Bike b = new Bike("Brand", "Model", 
        2, 125, 125000);
        
    }
}
