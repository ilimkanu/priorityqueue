import java.util.Comparator;

public class VipComparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        boolean b1 = o1.getVIP();
        boolean b2 = o1.getVIP();

        if (b1 == !b2) {
            return 1;
        }
        if (!b1 == b2) {
            return -1;
        }
        return 0;
    }
}
