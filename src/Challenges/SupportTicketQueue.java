package Challenges;

import java.util.ArrayList;

public class SupportTicketQueue {
    public static void main(String[] args) {

        ArrayList<String> tickets = new ArrayList<>();

        tickets.add("Login Issue");
        tickets.add("Printer Error");
        tickets.add("Network Lag");

        tickets.remove(0);

        tickets.add("Server Down");

        System.out.println(tickets +" "+tickets.size());

        for (String ticket : tickets){
            System.out.println("Pending : "+ticket);
        }
    }
}