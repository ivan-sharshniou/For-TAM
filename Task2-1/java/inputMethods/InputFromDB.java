package inputMethods;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class InputFromDB {

    public static List<String> input() {

        String url = "jdbc:mysql://localhost/carpark?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=Europe/Moscow";
        String login = "root";
        String pass = "root";
        String sql = "SELECT model, fuelconsumption, price FROM carpark";
        List<String> carinfo = new ArrayList<String>();

        try {
            Connection connection = DriverManager.getConnection(url, login, pass);
            PreparedStatement statement = connection.prepareStatement(sql);

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String model = resultSet.getString(1);
                String fuelconsumptio = resultSet.getString(2);
                String price = resultSet.getString(3);
                carinfo.add(model+" "+fuelconsumptio+" "+price);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } return  carinfo;
    }
}
