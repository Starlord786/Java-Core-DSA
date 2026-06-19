package DSA;
import java.util.*;

public class practice {
    public static void main(String[] a){
        int arr[] = {1,7,8,5,2};
        int target = 9;

        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            int compliments = target - arr[i];

            if(map.containsKey(compliments)){
                System.out.println(map.get(compliments) + "," + i);
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("No pairs found in the array");
    }
}
