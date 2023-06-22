package structural.bridge.classwork.restaurant.impl;

import structural.bridge.classwork.pizza.Pizza;
import structural.bridge.classwork.restaurant.Restaurant;

public class AmericanRestaurant extends Restaurant {

    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void addSauce() {
        pizza.setSauce("Everything");
    }

    @Override
    public void addTopping() {
        pizza.setToppings("Super secret recipe");
    }

    @Override
    public void makeCrust() {
        pizza.setCrust("Thick");
    }
}
