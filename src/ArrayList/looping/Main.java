package ArrayList.looping;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){

        ArrayList<Integer> number = new ArrayList<>();

        number.add(10);
        number.add(20);
        number.add(30);
        number.add(40);
        number.add(50);
        number.add(60);

        for(int i = 1; i< number.size(); i+=2){
            System.out.println("Numbers Even "+i+"  "+number.get(i));
        }
    }
}
