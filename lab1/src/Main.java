import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        /**Pizza[] all_pizzas = {
                new Pepperoni("Маленькая пепперони",18.55, 300, 20, 150.33, true),
                new Pepperoni("Средняя пепперони",23.50, 450, 25, 180.46, true),
                new Pepperoni("Большая пепперони", 27.19, 600, 30, 240.04, true),
                new Meat("Маленькая мясная",23.11, 300, 20, 180.50, true),
                new Meat("Средняя мясная",26.40, 450, 25, 225.50, true),
                new Meat("Большая мясная",31.20, 600, 30, 300.04, true),
                new Cheese("Маленькая сырная",15.60, 300, 20, 130.43, true),
                new Cheese("Средняя сырная",19.50, 450, 25, 160.76, true),
                new Cheese("Большая сырная",23.60, 600, 30, 220.43, true)
        };
        Scanner in = new Scanner(System.in);
        System.out.println("Введите вес пиццы:");
        double weight = in.nextDouble();
        System.out.println("Введите диаметр пиццы:");
        double diameter = in.nextDouble();
        int amount = 0;
        for (Pizza pizza : all_pizzas) {
            if (pizza.weight > weight) {
                amount++;
            }
        }
        System.out.println("Количество пицц вес которых больше заданного:\n" + amount);

        for (Pizza pizza : all_pizzas) {
            if (pizza.diameter > diameter) {
                System.out.println("Информация о пиццах диаметр которых больше заданного:\n" + pizza.getInfo());
            }
        }**/
        Boolean isStart = true;
        while (isStart){
            ExtraRepClass taskExample = new ExtraRepClass();
            System.out.println("Выберите действие:");
            System.out.println("1 - Добавить пиццы.");
            System.out.println("2 - Получить информацию о пицце.");
            System.out.println("3 - Обновить информацию о пицце.");
            System.out.println("4 - Удалить пиццу.");
            System.out.println("5 - Завершить процесс.");
            Scanner actionNumber = new Scanner(System.in);
            int userAction = actionNumber.nextInt();
            switch (userAction){
                case (1):
                    taskExample.addPizza();
                    break;
                case (2):
                    taskExample.getPizzas();
                    break;
                case(3):
                    taskExample.updatePizzaInfo();
                    break;
                case(4):
                    taskExample.deletePizza();
                    break;
                case(5):
                    isStart = false;
            }
        }
    }
}