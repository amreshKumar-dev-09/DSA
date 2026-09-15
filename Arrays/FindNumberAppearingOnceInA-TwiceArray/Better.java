// Time complexity = O(n)
// Space complexity = O(n)

import java.util.HashMap;

public class Better{

    public static void Solution(int[] arr){
        int n = arr.length;

        HashMap<Integer, Integer> ans = new HashMap<>();

        for(int i = 0; i < n; i++){
            ans.put(arr[i], ans.getOrDefault(arr[i], 0)+1);
        }

        for(int nums : ans.keySet()){
            if(ans.get(nums) == 1){
                System.out.println("The number appearing once in a twice array is: "+nums);
                return;
            }
        }
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,4,4,5,5};

        Solution(arr);
    }
}