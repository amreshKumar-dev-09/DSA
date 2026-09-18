// Time Complexity = O(n)
// Space Complexity = O(n)

import java.util.HashMap;

public class Better{
   public static void FindLongestSubarray(int[] arr, int k){
        int n  = arr.length;
        int maxLength = 0;
        int sum = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        map.put(0, -1);

        for(int i = 0; i < n; i++){
            sum += arr[i];

            
            int rem = sum - k;

            if(map.containsKey(rem)){
                int length = i - map.get((rem));
                maxLength = Math.max(maxLength, length);
            }

             if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        System.out.println(maxLength);
   }

    public static void main(String[] args){
        int[] arr = {1,2,3,0,0,0,0,4,2,3};

        FindLongestSubarray(arr, 3);

    }
}