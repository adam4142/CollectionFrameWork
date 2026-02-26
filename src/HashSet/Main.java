package HashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args){

        HashSet<Integer> id = new HashSet<>();

        id.add(101);
        id.add(102);
        id.add(101); //Duplicate will be ignored.
        id.add(103);

        System.out.println("Unique ID's = "+id);
        System.out.println("Total Count " +id.size());
    }
}
