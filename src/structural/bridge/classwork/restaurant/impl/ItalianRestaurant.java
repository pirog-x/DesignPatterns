package structural.bridge.classwork.restaurant.impl;

import structural.bridge.classwork.pizza.Pizza;
import structural.bridge.classwork.restaurant.Restaurant;

public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    public void addTopping() {
        pizza.setToppings(null);
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thin");
    }
}
