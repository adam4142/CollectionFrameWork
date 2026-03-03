package ArrayList.CustomeClass;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        ArrayList<Ticket> supportQueue = new ArrayList<>();

        supportQueue.add(new Ticket("Network Down", "P1"));
        supportQueue.add(new Ticket("Printer Jam", "P3"));
        supportQueue.add((new Ticket("Email issue", "P2")));

        for (Ticket t : supportQueue) {
            System.out.println("Description: "+t.description+ " | Priority: "+t.priority);
        }
    for (Ticket Tick : supportQueue){
        if (Tick.description.equals("Network Down")){
            Tick.priority = "P0 - CRITICAL";
            System.out.println("Upgraded priority");
        }
    }
    }
}
