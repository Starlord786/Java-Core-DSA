package DSA;

public class MissingElement{

    public static void sort(int[] arr){
        int i = 0;
        
        while(i < arr.length){
            int correct = arr[i] -1;

            if(arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int missingelement(int[] arr){


        for(int i = 0; i < arr.length; i++){
            int index = i;
            if(arr[i] != index + 1){
                return index + 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {

        int[] arr = {4, 2, 6, 1, 3};

        sort(arr);

        System.out.println(missingelement(arr));
        
    }

}