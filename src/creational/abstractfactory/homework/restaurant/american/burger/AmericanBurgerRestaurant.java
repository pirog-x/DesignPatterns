package creational.abstractfactory.homework.restaurant.american.burger;

import creational.abstractfactory.homework.restaurant.Restaurant;
import creational.abstractfactory.homework.restaurant.burger.BeefBurger;
import creational.abstractfactory.homework.restaurant.burger.VeggieBurger;

public class AmericanBurgerRestaurant extends Restaurant {
    @Override
    public VeggieBurger createVeggieBurger() {
        return new AmericanVeggieBurger();
    }

    @Override
    public BeefBurger createBeefBurger() {
        return new AmericanBeefBurger();
    }
}
