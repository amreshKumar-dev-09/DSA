// Time complexity = O(n)
// Space Complexity = O(1)

/* Sliding Window → non-negative array
HashMap Prefix Sum → works with negative, zero, and positive elements.*/

public class Optimal{

    public static void FindLongestSubarray(int[] arr, int k){
        int n = arr.length;
        int sum = 0;
        int maxLength = 0;

        int i = 0;
        for(int j = 0; j < n; j++){
            sum += arr[j];

            while(sum > k){
                sum -= arr[i];
                i++;
            }

            if(sum == k){
                int len = j - i + 1;
                maxLength = Math.max(maxLength, len);
            }
        }
        System.out.println(maxLength);
    }


    public static void main(String[] args){
        int[] arr = {1,2,3,1,1,1,1,4,2,3};

        FindLongestSubarray(arr, 3);
    
    }
    
}