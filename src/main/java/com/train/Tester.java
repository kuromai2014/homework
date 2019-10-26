package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.print("Please enter number of tickets:");
        Scanner scanner = new Scanner(System.in);
        int FullTicket = scanner.nextInt();
        System.out.print("How many round-trip tickets:");
        int SingleTicket = scanner.nextInt();
        Ticket Ti = new Ticket(FullTicket ,SingleTicket);
        Ti.print();
    }
}
