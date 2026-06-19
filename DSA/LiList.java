package DSA;
import java.util.Iterator;
import java.util.LinkedList;

public class LiList {
    public static void main(String[] a){
        LinkedList<Integer> li = new LinkedList<>();

        li.add(5);
        li.add(10);
        li.add(15);

        Iterator<Integer> it = li.iterator();

        while(it.hasNext()){
            int val = it.next();

            if(val == 10){
                it.remove();
            }

            else{
                System.out.println(val);
            }
        }
    }
}
