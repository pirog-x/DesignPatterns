import creational.factory.method.homework.Pizza;
import creational.factory.method.homework.PizzaFactory;
import creational.factory.method.homework.VeggiePizzaFactory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory veggieFactory = new VeggiePizzaFactory();
        Pizza veggiePizza = veggieFactory.createPizza();
    }
}
