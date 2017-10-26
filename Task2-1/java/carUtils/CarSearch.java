package carUtils;

import customExeptions.NoCarFoundExeption;
import entities.Car;

import java.util.ArrayList;
import java.util.List;

public class CarSearch {

    public static void search(List<Car> carpark, String modelforsearch, double fuelconsumptionforsearch, int priceforsearch) {


            List<Car> fullmatch = new ArrayList<Car>();
            List<Car> partialmatch = new ArrayList<Car>();
            for (Car c : carpark) {
                if (c.getModel().equalsIgnoreCase(modelforsearch) && c.getFuelconsumption() == fuelconsumptionforsearch && c.getPrice() == priceforsearch) {
                    fullmatch.add(c);
                } else if(c.getFuelconsumption() == fuelconsumptionforsearch | c.getPrice() == priceforsearch) {
                    partialmatch.add(c);
                }
            }
            try {
                if (fullmatch.size() > 0 && partialmatch.size() > 0) {
                    for (Car c : fullmatch) {
                        System.out.println("Full match [" + c + "]");
                    }
                    for (Car c : partialmatch) {
                        System.out.println("Partial match [" + c + "]");
                    }
                } else if (partialmatch.size() > 0 && fullmatch.size() <= 0 ) {
                    for (Car c : partialmatch) {
                        System.out.println("Partial match [" + c + "]");
                    }
                } else if (partialmatch.size() <= 0 && fullmatch.size() > 0) {
                    for (Car c : fullmatch) {
                        System.out.println("Full match [" + c + "]");
                    }
                } else {
                    throw new NoCarFoundExeption("No car was found");
                }
            } catch (NoCarFoundExeption nocarex) {
                System.out.println("No Matches");
            }
    }
}
