// Time Complexity = O(n).
// Space Complexity = O(n)
// Theoretical worst-case HashSet: Time O(n²), Space O(n)

import java.util.Set;
import java.util.HashSet;

public class BruteForce {

    public static int removeDuplicated(int[] arr) {

        Set<Integer> set = new HashSet<>();

        int index = 0;

        for(int nums : arr){

            if(!set.contains(nums)){

                set.add(nums);

                arr[index] = nums;

                index++;
            }
        }

        return index;
    }

    public static void main(String a[]) {

        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        int k = removeDuplicated(arr);

        System.out.println("k = " + k);

        for(int i = 0; i < k; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
