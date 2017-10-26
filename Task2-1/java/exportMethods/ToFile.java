package exportMethods;

import entities.Car;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ToFile {

    public static void toFile(List<Car> carpark) {
        try {
            File file = new File("resources/carparkoutput.txt");
            FileWriter writer = new FileWriter(file);
            for (Car c: carpark) {
                writer.write(c.toString() + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
