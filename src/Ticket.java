public class Ticket implements Comparable<Ticket> {
    private Integer cost;
    private Boolean isVIP;

    public Ticket() {
    }

    public Ticket(Integer cost, Boolean isVIP) {
        this.cost = cost;
        this.isVIP = isVIP;
    }

    public Integer getCost() {
        return cost;
    }

    public void setCost(Integer cost) {
        this.cost = cost;
    }

    public Boolean getVIP() {
        return isVIP;
    }

    public void setVIP(Boolean VIP) {
        isVIP = VIP;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "cost=" + cost +
                ", isVIP=" + isVIP +
                '}';
    }

    @Override
    public int compareTo(Ticket o) {
        return 0;
    }
}
