import java.util.ArrayList;

public class Demo{
    public static void main(String[] a){
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("OOP");
        list.add("Collections");

        //System.out.println(list.get(0));
        //System.out.println(list.size());

        //System.out.println(list);

        //list.remove(2);
        //System.out.println(list);

        //list.set(0, "Advanced Java");
        //System.out.println(list);


        //for loop:
        //for(int i = 0; i<list.size(); i++){
          //  System.out.println(list.get(i));
        //}

        //for-each loop
        for(String items : list){
            System.out.println(items);
        }
    }
}