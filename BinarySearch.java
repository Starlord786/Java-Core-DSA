import java.util.*;

public class BinarySearch {

    public static int Bsearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } 
            else if (target > arr[mid]) {
                low = mid + 1;
            } 
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Array Size: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the Array Elements (sorted):");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Target Element to Find: ");
        int target = sc.nextInt();

        int result = Bsearch(arr, target);

        if (result == -1) {
            System.out.println("The Target Element is not found");
        } else {
            System.out.println("The Target Element is Found at index: " + result);
        }

        sc.close();
    }
}