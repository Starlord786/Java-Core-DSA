package DSA;

import java.util.Arrays;

public class BubbleSort {
    public static void Bubble(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 1; j<arr.length; j++){
                if(arr[j] < arr[j-1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }

    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] a){
        int[] arr = {4, 17};
        Bubble(arr);

        System.out.println(Arrays.toString(arr));
    }
}
