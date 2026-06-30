package DSA;


public class OrderAgnosticBSearch {
    public static void main(String[] args) {
        int[] arr = {59, 45, 34, 11, 5, 3, 2, 1};//59 45 34 11 5 3 2 1
        int target = 11;

        int ans = bSearch(arr, target);

        System.out.println(ans);
    }

    static boolean orderAgnostic(int[] arr){

        if(arr[0] < arr[arr.length - 1]){
            return true;
        }

        else{
            return false;
        }

    }

    static int bSearch(int[] arr, int target){


         int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid;
            } 

            if(orderAgnostic(arr)){
                if(target > arr[mid]){
                    low = mid + 1;
                }
                else{
                    high = mid - 1;
                }
            }
            else{
                if(target > arr[mid]){
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
            }
            
        }

        return -1;
    }
}
