// Time Complexity = O((n + m) log(n + m))
// Space Complexity = O(n + m)

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BruteForce2 {

    public static List<Integer>FindUnion(int[] arr1, int arr2[]){
      
        HashSet<Integer> st =  new HashSet<>();

        for(int n : arr1){
            st.add(n);
        }

        for(int m : arr2){
            st.add(m);
        }

        List<Integer> union = new ArrayList<>();
        
        for(int nums : st){
            union.add(nums);
        }

        return union;
    }

    public static void main(String[] args{
        int arr1[] = {6,4,5,1,2};
        int arr2[] = {2,1,5,7};

        List<Integer> union = FindUnion(arr1, arr2);

        System.out.println("Union of arr1 and arr2 is ");
        for (int val : union){
            System.out.print(val + " ");
        }
            
    }
}
