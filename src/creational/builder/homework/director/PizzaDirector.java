package creational.builder.homework.director;

import creational.builder.homework.builder.Builder;

public class PizzaDirector {
    public void smallPepperoniPizza(Builder builder) {
        builder.size(30)
                .cheeseType("mozzarella")
                .crustType("crisp")
                .sauceType("Ketchup")
                .topping("olives");
    }

    public void mediumPepperoniPizza(Builder builder) {
        builder.size(50)
                .cheeseType("mozzarella")
                .crustType("crisp")
                .sauceType("Ketchup")
                .topping("olives");
    }

    public void bigPepperoniPizza(Builder builder) {
        builder.size(75)
                .cheeseType("mozzarella")
                .crustType("crisp")
                .sauceType("Ketchup")
                .topping("olives");
    }
}
