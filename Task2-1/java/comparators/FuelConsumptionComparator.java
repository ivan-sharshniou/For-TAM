package comparators;

import entities.Car;

import java.util.Comparator;

public class FuelConsumptionComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        if (o1.getFuelconsumption() > o2.getFuelconsumption()) {
            return 1;
        } else if (o1.getFuelconsumption() < o2.getFuelconsumption()) {
            return -1;
        } else {
            return 0;
        }
    }
}
