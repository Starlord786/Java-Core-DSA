public class Factorial {
    public static void main(String[] a)
    {
        int num = 6;
        int Factorial = 1;

        for(int i = num; i>=1; i--)
        {
            Factorial = Factorial*i;
        }

        System.out.println(Factorial);
    }
}
