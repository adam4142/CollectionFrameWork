package ArrayList.Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args){
        ArrayList<String> tickets = new ArrayList<>();
        tickets.add("Z - Server Down");
        tickets.add("A - Login Issue");
        tickets.add("C - Network Lag");

        System.out.println("Before Sorting: "+tickets);
//Sorting
        Collections.sort(tickets);

        System.out.println("After Sorting: " +tickets);

        //Searching

        int index = Collections.binarySearch(tickets, "A - Login Issue");
        System.out.println("Ticket found at index: " +index);
    }
}
