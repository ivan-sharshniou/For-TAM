import carUtils.CarParkCost;
import carUtils.CarSearch;
import carUtils.CarparkListCreationFromSource;
import carUtils.SortingByFuelConsumption;
import customExeptions.LessThanZeroExeption;
import entities.Car;
import exportMethods.ToFile;
import inputMethods.InputFromDB;
import inputMethods.InputFromTXT;
import inputMethods.InputFromPredefinedList;
import inputMethods.InputFromXML;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Main {

    static double fuelconsumptionforsearchdouble;
    static int priceforsearchint;
    static String modelforsearch;
    static String fuelconsumptionforsearchstring;
    static String priceforsearchstring;

    public static void main (String[] args) {

        List<Car> carpark;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type: \n '1' to read from txt \n '2' to read from DB \n" +
                " '3' to read from xml \n press 'ENTER' for use predefined car park list ");
        String inputoption = null;
        try {
            inputoption = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if(inputoption.equalsIgnoreCase("1")) {
            carpark = CarparkListCreationFromSource.getCarpark(InputFromTXT.inputfromfile());
        }
        else if (inputoption.equalsIgnoreCase("2")) {
            carpark = CarparkListCreationFromSource.getCarpark(InputFromDB.input());
        }
        else if (inputoption.equalsIgnoreCase("3")) {
            carpark = CarparkListCreationFromSource.getCarpark(InputFromXML.inputFromXml());
        }
        else {
            carpark = CarparkListCreationFromSource.getCarpark(InputFromPredefinedList.getPredefinedList());
        }

        SortingByFuelConsumption.getSortedList(carpark);

        CarParkCost.getCarParkCost(carpark);

        try {
            System.out.println("Enter model name for search: ");
            modelforsearch = br.readLine();
            System.out.println("Enter fuel consumption value for search: ");
            fuelconsumptionforsearchstring = br.readLine();
            System.out.println("Enter price for search: ");
            priceforsearchstring = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            fuelconsumptionforsearchdouble = Double.parseDouble(fuelconsumptionforsearchstring);
            if (fuelconsumptionforsearchdouble < 0) {
                throw new LessThanZeroExeption("Negative fuel consumption value");
            }
        } catch (NumberFormatException e) {
            System.err.println("Please use doubles for fuel consumption!");
        } catch (LessThanZeroExeption e) {
            System.err.println("Fuel consumption can not be negative");
        }

        try {
            priceforsearchint = Integer.parseInt(priceforsearchstring);
            if (priceforsearchint < 0) {
                throw new LessThanZeroExeption("Price can not be negative");
            }
        } catch (NumberFormatException e) {
            System.err.println("Please use integers for price!");
        } catch (LessThanZeroExeption e) {
            System.err.println("Price can not be negative");
        }

        CarSearch.search(carpark, modelforsearch, fuelconsumptionforsearchdouble, priceforsearchint);

        ToFile.toFile(carpark);
    }
}
