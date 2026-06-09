public class Count {
    public static void main(String[] a)
    {
        int num = 9876556;
        int count = 0;

        while(num!=0){
            num = num / 10;
            count++;
        }

        System.out.println(count);
    }
}
