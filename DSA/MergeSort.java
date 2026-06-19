package DSA;
public class MergeSort{


    public static void Mergesort(int[] arr, int l, int r){

        if(l<r){

            int median = (l+r)/2;

            Mergesort(arr, l, median);
            Mergesort(arr, median+1, r);

            Merge(arr, l, median, r);
        }
    }

    public static void Merge(int[] arr, int l, int median, int r){
        int n1 = median - l + 1;
        int n2 = r - median;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int x = 0; x<n1; x++){
            lArr[x] = arr[l + x];
        }

        for(int x = 0; x<n2; x++){
            rArr[x] = arr[median + 1 + x];
        }

        int i = 0;
        int j = 0;
        int k = l;

        while(i<n1 && j<n2){
            if(lArr[i] <= rArr[j]){
                arr[k] = lArr[i];
                i++;
            }

            else{
                arr[k] = rArr[j];
                j++;
            }

            k++;
        }

        while(i<n1){
            arr[k] = lArr[i];
            i++;
            k++;
        }

        while(j<n2){
            arr[k] = rArr[j];
            j++;
            k++;
        }
    }


    public static void main(String[] a){

        int[] arr = {5,3,1,4,6,2};

        System.out.println("Before Sorting:");

        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();


        Mergesort(arr, 0, arr.length-1);



        System.out.println("After Sorting:");

        for(int num : arr){
            System.out.print(num + " ");
        }

        System.out.println();
    }
}