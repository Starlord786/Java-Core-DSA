package DSA;

import java.util.Arrays;

public class SelectionSort {
    
    public static void Selection(int[] arr){

        for(int i=0; i<arr.length - 1; i++){
            
            int minIndex = getmin(arr, i);

            swap(arr, minIndex, i);

        }
    } 

    public static int getmin(int[] arr, int start){
        int minIndex = start;

        for(int i = start + 1; i<arr.length; i++){
            if(arr[i] < arr[minIndex]){
                minIndex = i;
            }
        }

        return minIndex;
    }

    public static void swap(int[] arr,  int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static void main(String[] a){
        int[] arr = {5,1};

        Selection(arr);

        System.out.println(Arrays.toString(arr));
    }

}
