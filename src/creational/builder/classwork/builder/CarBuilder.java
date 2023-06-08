package creational.builder.classwork.builder;

public interface CarBuilder {
    CarBuilder id(int id);
    CarBuilder brand(String brand);
    CarBuilder model(String model);
    CarBuilder numberOfDoors(int numberOfDoors);
    CarBuilder screenType(String screenType);
    CarBuilder weight(double weight);
    CarBuilder height(double height);
}
