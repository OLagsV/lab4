import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ExtraRepClass {
    private Map<Integer,Pizza> pizzas = new HashMap<Integer,Pizza>();
    private int currentId = 0;
    public void getPizzas(){
        for(Map.Entry<Integer, Pizza> item : pizzas.entrySet()){

            System.out.println("Id:" + item.getKey() + "\n" + item.getValue().getInfo());
        }
    }
    public void addPizza(){
        Scanner pizzaInput = new Scanner(System.in);
        System.out.println("Введите название: ");
        String name = pizzaInput.nextLine();
        System.out.println("Введите цену: ");
        Double price = pizzaInput.nextDouble();
        System.out.println("Введите вес: ");
        Double weight = pizzaInput.nextDouble();
        System.out.println("Введите диаметр: ");
        Double diameter = pizzaInput.nextDouble();
        System.out.println("Введите каллорийность: ");
        Double calories = pizzaInput.nextDouble();
        System.out.println("Введите вид пиццы: \n1-Сырная \n2-Мясная \n3-Пепперони");
        int pizzaType = pizzaInput.nextInt();
        if(pizzaType == 1){
            System.out.println("С чесночным соусом? \n1.Да \n2.Нет");
            int sauceGarlic = pizzaInput.nextInt();
            Boolean hasSause;
            if(sauceGarlic == 1) {
                hasSause = true;
            }else{
                hasSause = false;
            }
            pizzas.put(currentId,new Cheese(name,price,weight,diameter,calories,hasSause));
        }else if(pizzaType == 2){
            System.out.println("С соусом барбекю? \n1.Да \n2.Нет");
            int sauceBbq = pizzaInput.nextInt();
            Boolean hasSause;
            if(sauceBbq == 1) {
                hasSause = true;
            }else{
                hasSause = false;
            }
            pizzas.put(currentId,new Meat(name,price,weight,diameter,calories,hasSause));
        } else if(pizzaType == 3){
            System.out.println("С карри соусом? \n1.Да \n2.Нет");
            int sauceCarri = pizzaInput.nextInt();
            Boolean hasSause;
            if(sauceCarri == 1) {
                hasSause = true;
            }else{
                hasSause = false;
            }
            pizzas.put(currentId,new Pepperoni(name,price,weight,diameter,calories,hasSause));
        }
    }

    public void updatePizzaInfo(){
        Scanner pizzaInput = new Scanner(System.in);
        System.out.println("Введите Id пиццы, информацию о которой небходимо изменить: ");
        int changeId = pizzaInput.nextInt();
        System.out.println("Введите название: ");
        String name = pizzaInput.next();
        System.out.println("Введите цену: ");
        Double price = pizzaInput.nextDouble();
        System.out.println("Введите вес: ");
        Double weight = pizzaInput.nextDouble();
        System.out.println("Введите диаметр: ");
        Double diameter = pizzaInput.nextDouble();
        System.out.println("Введите каллорийность: ");
        Double calories = pizzaInput.nextDouble();
        System.out.println("Введите вид пиццы: \n1-Сырная \n2-Мясная \n3-Пепперони");
        int pizzaType = pizzaInput.nextInt();
        if(pizzaType == 1){
            System.out.println("С чесночным соусом? \n1.Да \n2.Нет");
            int sauceGarlic = pizzaInput.nextInt();
            Boolean hasSause;
            if(sauceGarlic == 1) {
                hasSause = true;
            }else{
                hasSause = false;
            }
            pizzas.put(changeId,new Cheese(name,price,weight,diameter,calories,hasSause));
        }else if(pizzaType == 2){
            System.out.println("С соусом барбекю? \n1.Да \n2.Нет");
            int sauceBbq = pizzaInput.nextInt();
            Boolean hasSause;
            if(sauceBbq == 1) {
                hasSause = true;
            }else {
                hasSause = false;
            }
            pizzas.put(changeId,new Meat(name,price,weight,diameter,calories,hasSause));
        } else if(pizzaType == 3){
            System.out.println("С карри соусом? \n1.Да \n2.Нет");
            int sauceCarri = pizzaInput.nextInt();
            Boolean hasSause;
            if(sauceCarri == 1) {
                hasSause = true;
            }else {
                hasSause = false;
            }
            pizzas.put(changeId,new Pepperoni(name,price,weight,diameter,calories,hasSause));
        }
    }
    public void deletePizza(){
        Scanner deletePizza = new Scanner(System.in);
        System.out.println("Введите Id пиццы которую нужно удалить: ");
        int deleteId = deletePizza.nextInt();
        pizzas.keySet().removeIf(key -> key == deleteId);
    }
}
