package creational.builder.classwork.entities;

import creational.builder.classwork.builder.CarBuilder;

public class Car {
    private int id;
    private String brand;
    private String model;
    private int numberOfDoors;
    private String screenType;
    private double weight;
    private double height;

    private Car(int id, String brand, String model, int numberOfDoors, String screenType, double weight, double height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.screenType = screenType;
        this.weight = weight;
        this.height = height;
    }

    public static InnerCarBuilder builder(){
        return new InnerCarBuilder();
    }

    public static class InnerCarBuilder implements CarBuilder {
        private int id;
        private String brand;
        private String model;
        private int numberOfDoors;
        private String screenType;
        private double weight;
        private double height;

        public InnerCarBuilder id(int id) {
            this.id = id;
            return this;
        }

        public InnerCarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public InnerCarBuilder model(String model) {
            this.model = model;
            return this;
        }

        public InnerCarBuilder numberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        public InnerCarBuilder screenType(String screenType) {
            this.screenType = screenType;
            return this;
        }

        public InnerCarBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        public InnerCarBuilder height(double height) {
            this.height = height;
            return this;
        }

        public Car build() {
            return new Car(id, brand, model, numberOfDoors, screenType, weight, height);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", numberOfDoors=" + numberOfDoors +
                ", screenType='" + screenType + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}