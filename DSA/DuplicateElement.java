package DSA;

public class DuplicateElement {

    public static void main(String[] args) {
        int[] arr = {7, 2, 5, 1, 3, 7, 4};

        sort(arr);

        System.out.println(Duplicate(arr));
    }

    public static void sort(int[] arr){
        int i = 0;

        while(i < arr.length){
            int correct = arr[i] -1;

            if(arr[i] != arr[correct]){
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

    static int Duplicate(int[] arr){

        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i+1){
                return arr[i];
            }
        }

        return -1;

    }

}
