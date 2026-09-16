// Time Complexity = O(n + n log n + n) = O(n log n)
// Space Complexity = O(n)

/* Two-pointer is efficient for a sorted array, but for an unsorted array where you need the original indices,
 the sorting + two-pointer approach is less efficient than HashMap. */

import java.util.Arrays;

public class Optimal{

    public static String TwoSumExists(int arr[], int target, int n){

        int[][] numsWithIndex = new int[n][n];

        for(int i = 0; i < n; i++){
            numsWithIndex[i][0] = arr[i];
            numsWithIndex[i][1] = i;
        }

        int left = 0;
        int right = n - 1;

        Arrays.sort(numsWithIndex, (a , b) -> Integer.compare(a[0], b[0]));

       
        while(left < right){

            int sum = numsWithIndex[left][0] + numsWithIndex[right][0];

            if(sum == target){
                return "Yes";
            }

            else if(sum < target){
                left++;
            }

            else{
                right--;
                
            }


        }
        

        return "No";

    }

    public static int[] TwoSumIndices(int arr[], int target, int n){

        int[][] numsWithIndex = new int[n][n];

        for(int i = 0; i < n; i++){
            numsWithIndex[i][0] = arr[i];
            numsWithIndex[i][1] = i;
        }

        int left = 0;
        int right = n - 1;

        Arrays.sort(numsWithIndex, (a , b) -> Integer.compare(a[0], b[0]));

       
        while(left < right){

            int sum = numsWithIndex[left][0] + numsWithIndex[right][0];

            if(sum == target){
                return new int[] { numsWithIndex[left][1], numsWithIndex[right][1]};
            }

            else if(sum < target){
                left++;
            }

            else{
                right--;
                
            }


        }
        
        return new int[] {-1,-1};

    }


    public static void main(String[] args){
        int arr[] = {2,6,5,8,11};
        int n = arr.length;
        int target = 14;

        System.out.println(TwoSumExists(arr, target, n));

        int result[] = TwoSumIndices(arr, target, n);
        System.out.println("[" +  result[0] + " " + result[1] +"]");

    }
}