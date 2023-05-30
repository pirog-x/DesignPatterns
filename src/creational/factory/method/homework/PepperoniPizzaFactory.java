package creational.factory.method.homework;

import creational.factory.method.homework.pizzas.Pepperoni;

public class PepperoniPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        return new Pepperoni();
    }
}
