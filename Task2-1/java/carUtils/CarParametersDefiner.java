package carUtils;

import entities.Car;

public class CarParametersDefiner {

    public static Car getCarParameters(String carinfostring) {
        String[] carinfo = carinfostring.split("\\s");
        String model = carinfo[0];
        double fuelconsumption = Double.parseDouble(carinfo[1]);
        int price = Integer.parseInt(carinfo[2]);
        return new Car(model, fuelconsumption, price);
    }
}
