package structural.bridge.classwork.pizza.impl;

import structural.bridge.classwork.pizza.Pizza;

public class VeggiePizza extends Pizza {

    @Override
    public void assemble() {
        System.out.println("Adding sauce: " + sauce);
        System.out.println("Adding toppings: " + toppings);
        System.out.println("Adding Cheese") ;
    }

    @Override
    public void qualityCheck() {
        System.out.println("Crust is: " + crust);
    }
}
