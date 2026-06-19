package DSA;
import java.util.HashMap;

public class Map {
    public static void main(String[] a){
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Shaban");
        map.put(2, "Java");
        map.put(3, "SDE");

        for(HashMap.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }

        System.out.println(map.containsKey(2));
        System.out.println(map.containsValue("Java"));

        map.remove(1);
        System.out.println(map);
    }
}
