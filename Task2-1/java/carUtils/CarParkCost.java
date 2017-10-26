package carUtils;

import entities.Car;

import java.util.List;

public class CarParkCost {
    private static int carparkcost;

    public static void getCarParkCost(List<Car> carpark) {
        for (Car c : carpark){
            carparkcost = carparkcost + c.getPrice();
        }
        System.out.println("\n" + "All cars cost: " + carparkcost);
    }
}
