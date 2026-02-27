package Challenges.DuplicateTicketFilter;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){
        HashSet<String> uniqueTickets = new HashSet<>();

        uniqueTickets.add("Wifi Down");
        uniqueTickets.add("Wifi Down");
        uniqueTickets.add("New Laptop Request");
        uniqueTickets.add("Wifi Down");

        System.out.println(uniqueTickets);

        System.out.println("Is Wifi Down in the list? " +uniqueTickets.contains("Wifi Down"));
    }
}
