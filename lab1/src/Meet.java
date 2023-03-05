class Meat extends Pizza {
    Boolean  sauceBbq;
    public Meat(String name, double price, double weight, double diameter, double calories, boolean sauceBbq) {
        super(name, price, weight, diameter, calories);
        this.sauceBbq = sauceBbq;
    }
    public String getInfo(){
        return "Название: " + name + "\nЦена: " + price + "\nВес: " + weight + "\nДиаметр: " + diameter + "\nКалории: " + calories + (sauceBbq ? "\nС соусом барбекю" : "Без соуса");
    }
}
