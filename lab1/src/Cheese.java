class Cheese extends Pizza {
    Boolean sauceGarlic;
    public Cheese(String name, double price, double weight, double diameter, double calories, boolean sauceGarlic) {
        super(name, price, weight, diameter, calories);
        this.sauceGarlic = sauceGarlic;
    }
    public String getInfo(){
        return "Название: " + name + "\nЦена: " + price + "\nВес: " + weight + "\nДиаметр: " + diameter + "\nКалории: " + calories + (sauceGarlic ? "\nС чесночным соусом" : "Без соуса");
    }
}