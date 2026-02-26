package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){

        //Creating ArrayList
        ArrayList<String> guest = new ArrayList<>();

        guest.add("Adam");
        guest.add("Eve");
        guest.add("Kevin");

        guest.remove("Eve");

        System.out.println(guest);
    }
}
