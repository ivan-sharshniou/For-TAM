package carUtils;

import customExeptions.NullCarExeption;
import entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarparkListCreationFromSource {

    public static List<Car> getCarpark(List<String> carinfo) {
        List<Car> carpark = new ArrayList<Car>();
        try {
            for (String s: carinfo) {
                Car car = CarParametersDefiner.getCarParameters(s);
                if (car != null) {
                    carpark.add(car);
                } else {throw new NullCarExeption ("Empty car object found");}
            }
        } catch (NullCarExeption e) {
            System.out.println(e.getMessage());;
        }
        return carpark;
    }
}
