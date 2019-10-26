package com.train;

public class Ticket {
    int FullTicket;
    int SingleTicket;

    public Ticket(int fullTicket, int singleTicket) {
        this.FullTicket = fullTicket;
        this.SingleTicket = singleTicket;
    }
    public void print() {
        System.out.println("Total tickets:" + FullTicket + "\n" + "Round-trip tickets:" + SingleTicket + "\n" +
                "Total:" + ((FullTicket-SingleTicket)*1000+SingleTicket*1800) );
    }
}
