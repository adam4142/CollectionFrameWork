package problem;

public class Main {
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,1,2,3,4,5,2};

        int k = 5;
        int m = 0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]!=k){
                m+=1;
            }
        }
        System.out.println(m);
    }
}
