package ArrayList.Report;

import java.util.HashMap;

public class Report {
    public static void main(String[]args){

        HashMap<String, Integer> ticketCount = new HashMap<>();

        ticketCount.put("Hardware", 5);
        ticketCount.put("Software", 12);
        ticketCount.put("Network", 3);

        for (String category : ticketCount.keySet()){
            if (ticketCount.get(category)>10){
                System.out.println("Alert! High Volume in : "+category);
            }

        }
    }
}
