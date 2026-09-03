// Time Complexity = O((n + m) log(n + m))
// Space Complexity = O(n + m)

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class BruteForce1{
    public static List<Integer>FindUnion(int[] arr1, int arr2[]){
        int n = arr1.length;
        int m = arr2.length;

        TreeMap<Integer,Integer> freq = new TreeMap<>();

        for(int i = 0; i < n; i++){
            freq.put(arr1[i], freq.getOrDefault(arr1[i],0)+1);
        }

        for(int i = 0; i < m; i++){
            freq.put(arr2[i], freq.getOrDefault(arr2[i],0)+1);
        }

        List<Integer> union = new ArrayList<>();

        for(int nums : freq.keySet()){
            union.add(nums);
        }

        return union;
    }
    public static void main(String a[]){
        int arr1[] = {6,4,5,1,2};
        int arr2[] = {2,1,5,7};

        List<Integer> union = FindUnion(arr1, arr2);

        System.out.println("Union of arr1 and arr2 is ");
        for (int val : union)
            System.out.print(val + " ");

    }
}