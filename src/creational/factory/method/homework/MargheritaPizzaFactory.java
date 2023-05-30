package creational.factory.method.homework;

import creational.factory.method.homework.pizzas.Margherita;

public class MargheritaPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new Margherita();
    }
}
