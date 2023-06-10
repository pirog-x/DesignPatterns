package creational.builder.homework.builder;

public interface Builder {
    Builder size(double size);
    Builder crustType(String crustType);
    Builder sauceType(String sauceType);
    Builder cheeseType(String cheeseType);
    Builder topping(String topping);
}
