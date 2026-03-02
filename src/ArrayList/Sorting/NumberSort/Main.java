package ArrayList.Sorting.NumberSort;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args){
        ArrayList<Integer> score = new ArrayList<>();

        score.add(85);
        score.add(100);
        score.add(42);
        score.add(91);

        Collections.sort(score);

        int index = Collections.binarySearch(score, 91);
        System.out.println(score);
        System.out.println(index);
        Collections.reverse(score);
        System.out.println(score);

        int index1 = Collections.binarySearch(score, 91, Collections.reverseOrder());
        System.out.println(index1);
    }
}
