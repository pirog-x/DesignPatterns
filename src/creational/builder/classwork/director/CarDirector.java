package creational.builder.classwork.director;

import creational.builder.classwork.builder.CarBuilder;

public class CarDirector {
    public void buildBugatti(CarBuilder builder) {
        builder.brand("Bugatti")
                .model("Chiron")
                .numberOfDoors(2)
                .weight(200)
                .height(170);
    }

    public void buildLambo(CarBuilder builder) {
        builder.brand("Lamborghini")
                .model("Aventador")
                .numberOfDoors(2)
                .weight(250)
                .height(176)
                .screenType("glossy");
    }
}
