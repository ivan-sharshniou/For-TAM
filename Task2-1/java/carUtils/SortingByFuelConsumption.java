package carUtils;

import comparators.FuelConsumptionComparator;
import entities.Car;

import java.util.Collections;
import java.util.List;

public class SortingByFuelConsumption {

    public static void getSortedList(List<Car> carpark) {
        Collections.sort(carpark, new FuelConsumptionComparator());
        for (Car c: carpark) {
            System.out.println(c);
        }
    }
}
