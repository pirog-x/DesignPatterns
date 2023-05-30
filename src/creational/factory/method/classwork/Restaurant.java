package creational.factory.method;

public abstract class Restaurant {
    public Burger orderBurger(String request){
        Burger burger = createBurger();
        burger.prepare();
        return burger;
    }

    public abstract Burger createBurger();
}
