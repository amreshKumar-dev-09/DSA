// Time Complexity = O(n log n)
// Space Complexity = O(1)


import java.util.Arrays;

public class BruteForce2 {

    public static int FindLargest(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;

        int largest = arr[n - 1];

        return largest;

    }
    public static void main(String a[]){
        
        int arr[] = {3, 2, 1, 5, 2};

        System.out.println("Largest: " + FindLargest(arr));

    }
    
}
