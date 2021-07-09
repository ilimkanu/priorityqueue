import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        VipComparator comp = new VipComparator();
        PriorityQueue<Ticket> tickets = new PriorityQueue<>(7, comp);
        tickets.add(new Ticket(300, true));
        tickets.add(new Ticket(290, false));
        tickets.add(new Ticket(200, false));
        tickets.add(new Ticket(400, true));
        tickets.add(new Ticket(450, true));
        tickets.add(new Ticket(550, true));
        tickets.add(new Ticket(230, false));

        tickets.forEach(System.out::println);

        System.out.println("----------------------------------------------");

        CostComparator comp2 = new CostComparator();
        PriorityQueue<Ticket> tickets1 = new PriorityQueue<>(7, comp2);
        tickets1.add(new Ticket(300, true));
        tickets1.add(new Ticket(290, false));
        tickets1.add(new Ticket(200, false));
        tickets1.add(new Ticket(400, true));
        tickets1.add(new Ticket(450, true));
        tickets1.add(new Ticket(550, true));
        tickets1.add(new Ticket(230, false));

        tickets1.forEach(System.out::println);
    }
}
