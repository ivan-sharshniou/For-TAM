package entities;

import java.util.Comparator;

public class Car {

    String model;
    double fuelconsumption;
    int price;

    public Car(String model, double fuelconsumption, int price) {
        this.model = model;
        this.fuelconsumption = fuelconsumption;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getFuelconsumption() {
        return fuelconsumption;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return this.getModel()+ ": " + this.getFuelconsumption() + "(l/100km) " + this.getPrice() + "$";
    }
}

