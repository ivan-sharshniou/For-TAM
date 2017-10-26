import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> randomlist = new ArrayList<String>();
        randomlist.add("AaAWwW");
        randomlist.add("EeEeEF");
        randomlist.add("wwWww");
        randomlist.add("oOoOoO");
        randomlist.add("asWdf");
        randomlist.add("yYyYFf");
        randomlist.add("NnNnWsWsWsWN WN");
        randomlist.add("nNn NnWWu wunewu L");
        randomlist.add("ae");
        randomlist.add("aefdWEcvaera");
        randomlist.add("");
        randomlist.add("XxXxxXXXXx");
        randomlist.add("PpPpPpAaAoO");
        //Sorting by length
        Collections.sort(randomlist, new LengthComparator());
        System.out.println("List sorted by the string length: ");
        for (String s : randomlist) {
            System.out.println(s);
        }
        //Find the second string by length
        System.out.println("\n" + "The second string by length: " + randomlist.get(1));
        //Sorting by vowel count
        Collections.sort(randomlist, new VowelComparator());
        System.out.println("\n" + "List sorted by the vowel count: ");
        for (String s : randomlist) {
            System.out.println(s);
        }
        //Sorting by consonant count
        Collections.sort(randomlist, new ConsonantComparator());
        System.out.println("\n" + "List sorted by the consonant count: ");
        for (String s : randomlist) {
            System.out.println(s);
        }
    }
}
