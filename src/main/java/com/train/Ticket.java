package com.train;

public class Ticket {
    int FullTicket;
    int SingleTicket;

    public Ticket(int FullTicket, int SingleTicket) {
        this.FullTicket = FullTicket;
        this.SingleTicket = SingleTicket;
    }
    public void print() {
        System.out.println("Total tickets:" + FullTicket + "\n" + "Round-trip tickets:" + SingleTicket + "\n" +
                "Total:" + ((FullTicket-SingleTicket)*1000+SingleTicket*1800) );
    }
}
