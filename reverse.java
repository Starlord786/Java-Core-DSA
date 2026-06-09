public class reverse {
    public static void main(String[] a){
        int num = 7897;
        int rev = 0;

        while(num!=0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        System.out.println(rev);
        
    }
}
