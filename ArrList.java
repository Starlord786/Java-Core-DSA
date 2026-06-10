import java.util.ArrayList;

public class ArrList {
    public static void main(String[] a){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);
        list.add(10);
        list.add(78);
        list.add(13);

        System.out.println(list.get(0));
        System.out.println(list.size());

        list.remove(3);

        for(int items : list){
            System.out.println(items);
        }
    }    
}
