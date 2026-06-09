
class LinearSearch{
    public static void main(String[] a)
    {
        int arr[] = {1,4,5,6,7,9};
;       int target = 7;

        for(int i = 0; i<arr.length-1; i++)
        {
            if(arr[i] == target)
            {
                System.out.println("The target element found at index " + i);
            }
        }
    }
}
