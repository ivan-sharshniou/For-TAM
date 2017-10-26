package inputMethods;

import java.util.ArrayList;
import java.util.List;

public class InputFromPredefinedList {

    public static List<String> getPredefinedList() {
        List<String> carinfo = new ArrayList<String>();
        carinfo.add("OPEL 8.8 5200");
        carinfo.add("BMW 12.1 7850");
        carinfo.add("AUDI 8.8 6900");
        carinfo.add("LADA 6.1 2700");
        carinfo.add("NISSAN 5.0 4750");
        carinfo.add("OPEL 8.3 6600");
        return carinfo;
    }
}
