package creational.builder.classwork;

import creational.builder.classwork.director.CarDirector;
import creational.builder.classwork.entities.Car;

public class DemoBuilder {
    public static void main(String[] args) {
//        CarBuilder builder = new CarBuilder();
//        Car bugattiCar = builder.id(1)
//                .brand("Bugatti")
//                .model("Chiron")
//                .numberOfDoors(2)
//                .weight(200)
//                .height(170)
//                .build();

        Car car = Car.builder()
                .id(1)
                .brand("Bugatti")
                .model("Chiron")
                .numberOfDoors(2)
                .weight(200)
                .height(170)
                .build();
        System.out.println(car);

        CarDirector director = new CarDirector();
        Car.InnerCarBuilder lamboBuilder = new Car.InnerCarBuilder();
        director.buildLambo(lamboBuilder);
        Car lambo = lamboBuilder.build();
        System.out.println(lambo);
    }
}
