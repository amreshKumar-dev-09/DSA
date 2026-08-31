// Time Complexity = O(n log n + n);
// Space complexity =  O(log n)

import java.util.Arrays;

public class BruteForce{
    public static void findSecondHighest(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n - 1];
        int SecondL = 0;

        for(int i = n - 2; i >= 0; i--){
            if(arr[i] != largest){
                SecondL = arr[i];
                break;
            }
        }
        System.out.println("Second Largest: "+SecondL);
    }
    public static void main(String a[]){
        int arr[] = {1,2,4,7,7,5};

        findSecondHighest(arr);
    }
}