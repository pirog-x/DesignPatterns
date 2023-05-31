package creational.abstractfactory.homework.restaurant.italian;


import creational.abstractfactory.homework.restaurant.Restaurant;
import creational.abstractfactory.homework.restaurant.burger.BeefBurger;
import creational.abstractfactory.homework.restaurant.burger.VeggieBurger;
import creational.abstractfactory.homework.restaurant.italian.burger.ItalianBeefBurger;
import creational.abstractfactory.homework.restaurant.italian.burger.ItalianVeggieBurger;

public class ItalianBurgerRestaurant extends Restaurant {

    @Override
    public VeggieBurger createVeggieBurger() {
        return new ItalianVeggieBurger();
    }

    @Override
    public BeefBurger createBeefBurger() {
        return new ItalianBeefBurger();
    }
}
