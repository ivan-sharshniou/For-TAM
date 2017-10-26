import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main (String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter a number and press 'Enter':");
        String xstring = br.readLine();
        Double xdouble = Double.parseDouble(xstring);

        System.out.println("Enter an operator and press 'Enter':");
        String operstring = br.readLine();
        char operchar = operstring.charAt(0);


        System.out.println("Enter a number and press 'Enter':");
        String ystring = br.readLine();
        Double ydouble = Double.parseDouble(ystring);

        Double result = null;

        if (operchar == '/' & ydouble == 0) {
            System.out.println("Denominator should be more than " + ydouble);
            br.close();
        } else {
            switch(operchar) {
                case '+':
                    result = xdouble + ydouble;
                    break;

                case '-':
                    result = xdouble - ydouble;
                    break;

                case '/':
                    result = xdouble / ydouble;
                    break;

                case '*':
                    result = xdouble * ydouble;
                    break;
            }
            System.out.println("Result: " + result);
            br.close();
        }
    }
}
