import java.util.Scanner;
public class FindElement {
    public static void main(String[] a)
    {
        System.out.println("Enter the Array Size: ");
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();

        int[] arr = new int[size];

        int found = 0;

        for(int i = 0; i<size; i++)
        {
            arr[i] = s.nextInt();
        }

        System.out.println("Enter a Target Element to be Found: ");
        int target = s.nextInt();

        for(int i = 0; i<size; i++)
        {
            if(arr[i] == target)
            {
                System.out.println("The Target Element Found at index " + i);
                found++;
            }

        }

        if(found == 0)
        {
            System.out.println("The Target Element not Found in the Array!");
        }

        s.close();
    }
}
