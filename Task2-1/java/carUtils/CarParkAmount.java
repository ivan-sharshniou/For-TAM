package carUtils;

import entities.Car;

import java.util.List;

public class CarParkAmount {

    public static int getCarparkAmount(List<Car> carpark) {
        int carparkamount = carpark.size();
        return carparkamount;
    }
}
