package bt;

public class BtSys {

    private int tickets = 1000;

    public BtSys() {
    }

    public BtSys(int tickets) {
        this.tickets = tickets;
    }

    public int getTickets() {
        return tickets;
    }

    public void setTickets(int tickets) {
        this.tickets = tickets;
    }

    public void Buyticket(){
        this.tickets--;
    }

}
