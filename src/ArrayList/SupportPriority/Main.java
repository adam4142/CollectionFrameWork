package ArrayList.SupportPriority;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){

        ArrayList<String> priorityQueue = new ArrayList<>();

        priorityQueue.add("P3 - Low");
        priorityQueue.add("P1 - Critical");
        priorityQueue.add("P2 - Medium");
        Collections.sort(priorityQueue);
        Collections.reverse(priorityQueue);

        int index = Collections.binarySearch(priorityQueue, "P1 - Critical", Collections.reverseOrder());

        for (String ticket : priorityQueue){
            System.out.println("Tickets : "+ticket);
        }
System.out.println(index);
    }
}
