// Time Complexity = O(n)
// Space Complexity = O(n)

import java.util.HashMap;

public class Better{

    public static String TwoSumExists(int arr[], int target, int n, HashMap<Integer, Integer> ans){

        for(int i = 0; i < n; i++){
            int complement = target - arr[i];

            if(!ans.containsKey(complement)){
             ans.put(arr[i], i);
                 
            }

            else{
                System.out.println(complement + " " + arr[i]);
                return "Yes";
            }
        }

        return "No";
    }

    public static int[] TwoSumIndices(int arr[], int target, int n, HashMap<Integer, Integer> ans){

        for(int i = 0; i < n; i++){
            int complement = target - arr[i];

            if(!ans.containsKey(complement)){
             ans.put(arr[i], i);
                 
            }

            else{
                return new int[] { ans.get(complement), i };
            }

        }

        return new int[] {-1, -1};

    }

    public static void main(String[] args){
        int arr[] = {2,6,5,8,11};
        int n = arr.length;
        int target = 14;
        HashMap<Integer, Integer> ans = new HashMap<>();

        System.out.println(TwoSumExists(arr, target, n, ans));

        int result[] = TwoSumIndices(arr, target, n, ans);
        System.out.println("[" +  result[0] + " " + result[1] +"]");

    }
}