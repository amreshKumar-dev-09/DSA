import java.util.ArrayList;
import java.util.List;

class Solution{
    public void sum(int[] arr, int target, int i, int n, ArrayList<Integer>list, ArrayList<List<Integer>>ans){

        if(i == n){
            if(target == 0){
                ans.add(new ArrayList<>(list));
            }
            return;
        }

        if(arr[i] <= target){
            list.add(arr[i]);
            sum(arr, target - arr[i], i, n, list, ans);
            list.remove(list.size() - 1);
        }

            sum(arr, target , i + 1, n, list, ans);

    }

}

public class CombinationalSum1 {
    public static void main(String[] args) {

        int[] arr = {2,3,6,7};

        ArrayList<List<Integer>> ans = new ArrayList<>();
        
        Solution obj = new Solution();
        obj.sum(arr, 7, 0, arr.length, new ArrayList<>(), ans);

        System.out.println(ans);

    }
    
}
