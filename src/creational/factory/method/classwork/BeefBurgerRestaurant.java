package creational.factory.method.classwork;

import creational.factory.method.classwork.burgers.BeefBurger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
