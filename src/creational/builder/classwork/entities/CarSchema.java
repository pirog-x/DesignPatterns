package creational.builder.classwork.entities;

import creational.builder.classwork.builder.CarBuilder;

public class CarSchema {
    private int id;
    private String brand;
    private String model;
    private int numberOfDoors;
    private String screenType;
    private double weight;
    private double height;

    private CarSchema(int id, String brand, String model, int numberOfDoors, String screenType, double weight, double height) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
        this.screenType = screenType;
        this.weight = weight;
        this.height = height;
    }

    public static CarSchema.CarSchemaBuilder builder() {
        return new CarSchema.CarSchemaBuilder();
    }

    public static class CarSchemaBuilder implements CarBuilder {
        private int id;
        private String brand;
        private String model;
        private int numberOfDoors;
        private String screenType;
        private double weight;
        private double height;

        @Override
        public CarSchemaBuilder id(int id) {
            this.id = id;
            return this;
        }

        @Override
        public CarSchemaBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        @Override
        public CarSchemaBuilder model(String model) {
            this.model = model;
            return this;
        }

        @Override
        public CarSchemaBuilder numberOfDoors(int numberOfDoors) {
            this.numberOfDoors = numberOfDoors;
            return this;
        }

        @Override
        public CarSchemaBuilder screenType(String screenType) {
            this.screenType = screenType;
            return this;
        }

        @Override
        public CarSchemaBuilder weight(double weight) {
            this.weight = weight;
            return this;
        }

        @Override
        public CarSchemaBuilder height(double height) {
            this.height = height;
            return this;
        }

        public CarSchema build() {
            return new CarSchema(id, brand, model, numberOfDoors, screenType, weight, height);
        }
    }
}
