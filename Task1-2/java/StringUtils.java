public class StringUtils {

    public static int getStringLength(Object o1) {
        return o1.toString().length();
    }

    public static int getStringVowelCount(Object o1) {
        String inputstring = o1.toString();
        int vowelcount = 0;
        for (int i = 0; i < inputstring.length(); i++) {
            char symbol = inputstring.toLowerCase().charAt(i);
            if (symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'o' || symbol == 'u' || symbol == 'y') {
                vowelcount++;
            }
        }
        return vowelcount;
    }

    public static int getStringConsonantCount(Object o1) {
        String inputstring = o1.toString();
        int consonantcount = 0;
        for (int i = 0; i < inputstring.length(); i++) {
            char symbol = inputstring.toLowerCase().charAt(i);
            switch (symbol) {
                case 'b':
                case 'c':
                case 'd':
                case 'f':
                case 'g':
                case 'h':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'v':
                case 'w':
                case 'x':
                case 'z':
                    consonantcount++;
            }
        }
        return consonantcount;
    }
}
