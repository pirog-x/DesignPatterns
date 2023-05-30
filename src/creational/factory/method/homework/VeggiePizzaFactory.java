package creational.factory.method.homework;

import creational.factory.method.homework.pizzas.Veggie;

public class VeggiePizzaFactory extends PizzaFactory {

    @Override
    public Pizza createPizza() {
        return new Veggie();
    }
}
