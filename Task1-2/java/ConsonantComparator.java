import java.util.Comparator;

public class ConsonantComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        if (StringUtils.getStringConsonantCount(o1) > StringUtils.getStringConsonantCount(o2)) {
            return 1;
        } else if (StringUtils.getStringConsonantCount(o1) < StringUtils.getStringConsonantCount(o2)) {
            return -1;
        } else {return 0;}
    }
}
