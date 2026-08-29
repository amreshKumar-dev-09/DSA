import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution{
    public void combination(int[] arr, int ind, int target, ArrayList<Integer>list, ArrayList<List<Integer>>ans){

        if(target == 0){
            ans.add(new ArrayList<>(list));
            return;
        }
        

       for(int i = ind; i < arr.length; i++){
            if(i > ind && arr[i] == arr[i - 1])continue;
            if(arr[i] > target) break;

            list.add(arr[i]);
            combination(arr, i + 1, target - arr[i], list, ans);
            list.remove(list.size() - 1);
        }
    }
}

// Time Complexity = O(2^n * n)
// Space Complexity = O(n * k)

public class CombinationalSum2 {
    public static void main(String[] args) {

        int[] arr = {10,1,2,7,6,1,5};

        ArrayList<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);
        
        Solution obj = new Solution();

        obj.combination(arr, 0, 8, new ArrayList<Integer>(), ans);

        System.out.println(ans);
    }
}
