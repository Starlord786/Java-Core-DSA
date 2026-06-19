package DSA;
import java.util.HashSet;

public class Set {
    public static void main(String[] a){
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10);
        set.add(20);

        //System.out.println(set);
        //System.out.println(set.contains(20));

        set.remove(30);
        System.out.println(set);

    }    
}
