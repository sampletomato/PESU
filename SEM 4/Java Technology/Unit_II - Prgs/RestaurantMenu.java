class Dish {
    // Properties / Attributes --> Data Members
    private String name, category;
    private boolean isVeg;
    private float price;
    private int timeAvailableFrom, timeAvailableTo;
    // 24-hour format, if a dish is available from 10:00 to 14:00
    // timeAvailableFrom = 10, timeAvailableTo = 14
    public void setName(String name) {this.name = name;}
    public void setCategory(String category) 
    {this.category = category;}
    public void setIsVeg(boolean isVeg) {this.isVeg = isVeg;}
    public void setPrice(float price) {this.price = price;}
    public void setTimeAvailableFrom(int t) 
    {this.timeAvailableFrom = t;}
    public void setTimeAvailableTo(int t)
    {this.timeAvailableTo = t;}
    // Constructor -- Call all the setters
    Dish(String name, String category, float price, 
        boolean isVeg, int timeAvailableFrom, int timeAvailableTo)
    {
        this.setName(name); this.setCategory(category);
        this.setIsVeg(isVeg); this.setPrice(price);
        this.setTimeAvailableFrom(timeAvailableFrom);
        this.setTimeAvailableTo(timeAvailableTo);
    }
    public String getName() {return name;}
    
}

public class RestaurantMenu {
    
}
