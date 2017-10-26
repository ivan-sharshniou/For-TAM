import java.util.Comparator;

public class LengthComparator implements Comparator{

    public int compare(Object o1, Object o2) {
        if (StringUtils.getStringLength(o1) > StringUtils.getStringLength(o2)) {
            return 1;
        } else if (StringUtils.getStringLength(o1) < StringUtils.getStringLength(o2)) {
            return -1;
        } else {return 0;}
    }
}
