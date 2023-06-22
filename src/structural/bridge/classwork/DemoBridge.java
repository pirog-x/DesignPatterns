package structural.bridge.classwork;

import structural.bridge.classwork.pizza.impl.PepperoniPizza;
import structural.bridge.classwork.pizza.impl.VeggiePizza;
import structural.bridge.classwork.restaurant.Restaurant;
import structural.bridge.classwork.restaurant.impl.AmericanRestaurant;
import structural.bridge.classwork.restaurant.impl.ItalianRestaurant;

public class DemoBridge {
    public static void main(String[] args) {
        Restaurant americanRestaurant = new AmericanRestaurant(new PepperoniPizza());
        americanRestaurant.deliver();

        Restaurant italianRestaurant = new ItalianRestaurant(new VeggiePizza());
        italianRestaurant.deliver();
    }
}
