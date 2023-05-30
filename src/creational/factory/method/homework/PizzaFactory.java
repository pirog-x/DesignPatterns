package creational.factory.method.homework;

public abstract class PizzaFactory {
    public Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
        return pizza;
    }

    public abstract Pizza createPizza();
}
