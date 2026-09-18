// Time Complexity = O(n^3)
// Space Complexity = O(1)

public class BruteForce1{
    public static void FindLongestSubarray(int[] arr, int k){
        int n  = arr.length;
        int maxLength = 0;

        for(int i = 0; i < n; i++){

            for(int j = i; j < n; j++){
                int sum = 0;

                for(int x = i; x <= j; x++){
                    sum += arr[x];
                }
                if(sum == k){
                 int len = j - i + 1;
                 maxLength = Math.max(maxLength, len);

                }
                 
            }
            
        }
        System.out.println(maxLength);
       
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,1,1,4,2,3};

        FindLongestSubarray(arr, 3);
    }
}