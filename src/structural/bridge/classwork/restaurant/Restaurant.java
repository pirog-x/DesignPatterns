package structural.bridge.classwork.restaurant;

import structural.bridge.classwork.pizza.Pizza;

public abstract class Restaurant {
    protected Pizza pizza;

    protected Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    protected abstract void addSauce();
    protected abstract void addTopping();
    protected abstract void makeCrust();

    public void deliver() {
        makeCrust();
        addSauce();
        addTopping();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in Progress!");
    }
}
