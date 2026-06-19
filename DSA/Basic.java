package DSA;
import java.util.*;

public class Basic{
    public static void main(String[] a){
        int[] arr = {1, 2, 2, 4, 5};

        HashSet <Integer> set = new HashSet<>();

        for(int nums : arr){
            set.add(nums);
        }

        System.out.println(set);
    }
}