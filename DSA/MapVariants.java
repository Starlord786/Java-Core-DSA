package DSA;
import java.util.*;

public class MapVariants {
    public static void main(String[] a){
        HashMap<Integer, String> hashmap = new HashMap<>();
        LinkedHashMap<Integer, String> linkedhashmap = new LinkedHashMap<>();
        TreeMap<Integer, String> treemap = new TreeMap<>();

        hashmap.put(2 , "Shaban");
        hashmap.put(1 , "Java");
        hashmap.put(3, null);

        linkedhashmap.put(null, "Shaban");
        linkedhashmap.put(1, "Java");
        linkedhashmap.put(2, "SDE");

        treemap.put(1,"Shaban");
        treemap.put(2, "Java");
        treemap.put(3, "SDE");

        System.out.println(hashmap);
        System.out.println(linkedhashmap);
        System.out.println(treemap);
    }
}
