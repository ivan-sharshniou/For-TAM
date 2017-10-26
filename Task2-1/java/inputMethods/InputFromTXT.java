package inputMethods;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputFromTXT {

    public static List<String> inputfromfile() {
        List<String> carinfo = new ArrayList<String>();
        File file = new File("resources/carparkinput.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                carinfo.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return carinfo;
    }
}