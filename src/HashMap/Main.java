package HashMap;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){

        HashMap<String, Integer> fruitPrices = new HashMap<>();

        fruitPrices.put("Apple", 50);
        fruitPrices.put("Banana", 20);

        //Getting a value using a key
        int applePrice = fruitPrices.get("Apple");

        System.out.println("The price of an apple is " +applePrice);
    }
}
