package oop1;

public class Car2 {
        private String brand;
        private String model;
        private double engineVolume;
        private String color;
        private int productionYear;
        private String productionCountry;

        public Car2(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
            this.brand = brand;
            this.model = model;
            this.engineVolume = engineVolume;
            this.color = color;
            this.productionYear = productionYear;
            this.productionCountry = productionCountry;
        }



        @Override
        public String toString() {
            return "brand = " + brand +
                    ", model = " + model +
                    ", engineVolume = " + engineVolume +
                    ", color = " + color +
                    ", productionYear = " + productionYear +
                    ", productionCountry = " + productionCountry;
        }
}
