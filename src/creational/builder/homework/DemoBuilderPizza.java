package creational.builder.homework;

import creational.builder.homework.builder.Builder;
import creational.builder.homework.director.PizzaDirector;

public class DemoBuilderPizza {
    public static void main(String[] args) {
        PizzaDirector pizzaDirector = new PizzaDirector();
        Pizza.PizzaBuilder builder = Pizza.builder();

        pizzaDirector.smallPepperoniPizza(builder);
        Pizza smallPepperoniPizza = builder.build();

        pizzaDirector.mediumPepperoniPizza(builder);
        Pizza mediumPepperoniPizza = builder.build();

        pizzaDirector.bigPepperoniPizza(builder);
        Pizza bigPepperoniPizza = builder.build();

        System.out.println(smallPepperoniPizza + "\n" + mediumPepperoniPizza + "\n" + bigPepperoniPizza);
    }
}
