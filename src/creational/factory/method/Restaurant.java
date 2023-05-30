package creational.factory.method;

import creational.factory.method.burgers.BeefBurger;
import creational.factory.method.burgers.VeggieBurger;

public class Restaurant {
    public Burger orderBurger(String request){
        Burger burger = null;
        if (request.equals("BEEF")) {
            burger = new BeefBurger();
        } else if (request.equals("VEGGIE")) {
            burger = new VeggieBurger();
        }
        burger.prepare();
        return burger;
    }
}
