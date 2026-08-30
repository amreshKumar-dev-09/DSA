// Time complexity = O(n log n) for best and average cases.
// Worst Case: (O(n²)), Occurs when the smallest or largest element is always chosen as the pivot (e.g., sorted arrays).
// Space Complexity = O(1)

public class QuickSort{

    public static int partition(int[] arr, int low, int high){
        int i = low;
        int j = high;
        int pivot = arr[low];

        while(i < j){

            while(arr[i] <= pivot && i <= high){
                i++;
            }

            while(arr[j] > pivot && j >= low + 1){
                j--;
            }

            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    public static void sort(int[] arr, int low, int high){

        if(low < high){
            int p = partition(arr, low, high);

            sort(arr, low, p - 1);
            sort(arr, p + 1, high);

        }
    }

    public static void main(String[] args){
        int arr[] = {4,6,2,5,7,9,1,3};
        int n = arr.length;

        sort(arr, 0, n - 1);

        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();

    }

}