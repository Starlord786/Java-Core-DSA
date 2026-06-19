package DSA;
import java.util.*;

public class Practice1{
    public static void main(String[] a){
        int[] arr = {1,2,2,3,3,3};

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : arr){
            if(map.containsKey(num)){
                map.put(num, map.get(num) + 1);
            }
            else{
                map.put(num, 1);
            }
        }

        for(Integer key : map.keySet()){
            System.out.println(key + "-> " + map.get(key));
        }
    }
}