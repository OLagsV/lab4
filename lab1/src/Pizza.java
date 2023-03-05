public abstract class Pizza {
    double price, weight, diameter, calories;
    String name;
    public Pizza(String name, double price, double weight, double diameter, double calories) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.diameter = diameter;
        this.calories = calories;
    }
    public abstract String getInfo();
}