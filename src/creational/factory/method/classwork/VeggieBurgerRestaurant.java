package creational.factory.method.classwork;


import creational.factory.method.classwork.burgers.VeggieBurger;

public class VeggieBurgerRestaurant extends Restaurant {
    @Override
    public Burger createBurger() {
        return new VeggieBurger();
    }
}
