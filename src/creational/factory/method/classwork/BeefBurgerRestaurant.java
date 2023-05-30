package creational.factory.method;

import creational.factory.method.burgers.BeefBurger;

public class BeefBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new BeefBurger();
    }
}
