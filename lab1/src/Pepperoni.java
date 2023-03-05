class Pepperoni extends Pizza {
    Boolean sauceCarri;
    public Pepperoni(String name, double price, double weight, double diameter, double calories, boolean sauceCarri) {
        super(name, price, weight, diameter, calories);
        this.sauceCarri = sauceCarri;
    }
    public String getInfo(){
        return "Название: " + name + "\nЦена: " + price + "\nВес: " + weight + "\nДиаметр: " + diameter + "\nКалории: " + calories + (sauceCarri ? "\nС соусом карри" : "Без соуса");
    }
}