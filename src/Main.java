import creational.abstractfactory.homework.restaurant.Restaurant;
import creational.abstractfactory.homework.restaurant.american.burger.AmericanBurgerRestaurant;
import creational.abstractfactory.homework.restaurant.burger.BeefBurger;
import creational.abstractfactory.homework.restaurant.burger.VeggieBurger;

public class Main {
    public static void main(String[] args) {
        Restaurant americanBurgerRestaurant = new AmericanBurgerRestaurant();
        BeefBurger americanBeefBurg = americanBurgerRestaurant.orderBeefBurger();
        VeggieBurger americanVeggieBurger = americanBurgerRestaurant.orderVeggieBurger();
    }
}
