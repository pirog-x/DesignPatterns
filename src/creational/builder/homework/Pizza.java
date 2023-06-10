package creational.builder.homework;

import creational.builder.homework.builder.Builder;

public class Pizza {
    private double size;
    private String crustType;
    private String sauceType;
    private String cheeseType;
    private String topping;

    private Pizza(double size, String crustType, String sauceType, String cheeseType, String topping) {
        this.size = size;
        this.crustType = crustType;
        this.sauceType = sauceType;
        this.cheeseType = cheeseType;
        this.topping = topping;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder implements Builder {
        private double size;
        private String crustType;
        private String sauceType;
        private String cheeseType;
        private String topping;

        @Override
        public Builder size(double size) {
            this.size = size;
            return this;
        }

        @Override
        public Builder crustType(String crustType) {
            this.crustType = crustType;
            return this;
        }

        @Override
        public Builder sauceType(String sauceType) {
            this.sauceType = sauceType;
            return this;
        }

        @Override
        public Builder cheeseType(String cheeseType) {
            this.cheeseType = cheeseType;
            return this;
        }

        @Override
        public Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        public Pizza build() {
            return new Pizza(size, crustType, sauceType, cheeseType, topping);
        }
    }
}
