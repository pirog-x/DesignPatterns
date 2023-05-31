package creational.abstractfactory.homework.restaurant;


import creational.abstractfactory.homework.restaurant.burger.BeefBurger;
import creational.abstractfactory.homework.restaurant.burger.VeggieBurger;

public abstract class Restaurant {
    public VeggieBurger orderVeggieBurger() {
        VeggieBurger burger = createVeggieBurger();
        burger.prepare();
        return burger;
    }

    public abstract VeggieBurger createVeggieBurger();

    public BeefBurger orderBeefBurger() {
        BeefBurger burger = createBeefBurger();
        burger.prepare();
        return burger;
    }

    public abstract BeefBurger createBeefBurger();
}
