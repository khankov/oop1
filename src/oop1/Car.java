package oop1;

public class Car {
    public String brand;
    public String model;
    public double engineVolume;
    public String color;
    public int productionYear;
    public String productionCountry;

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
