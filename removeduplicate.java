import java.util.*;

public class removeduplicate {
    public static void main(String[] a){

        int[] arr = {1, 2, 2, 3, 4, 4};

        TreeSet <Integer> set = new TreeSet<>();

        for(int i : arr){
            set.add(i);
        }

        System.out.println(set);
    }
}
