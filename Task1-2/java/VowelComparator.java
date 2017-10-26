import java.util.Comparator;

public class VowelComparator implements Comparator{
    public int compare(Object o1, Object o2) {
        if(StringUtils.getStringVowelCount(o1) > StringUtils.getStringVowelCount(o2)) {
            return 1;
        } else if(StringUtils.getStringVowelCount(o1) < StringUtils.getStringVowelCount(o2)) {
            return -1;
        } else {return 0;}
    }
}
