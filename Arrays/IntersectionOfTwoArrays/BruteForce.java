// Time Complexity = O(n*m)
// Space Complexity =  O(m + min(n,m)) = O(m)
/* The space complexity is O(m). We use a visited array of size m, so it takes O(m) space.
The answer list can take O(min(n,m)) space because the intersection cannot contain more elements than the smaller array. 
Therefore, the total is O(m + min(n,m)), which simplifies to O(m).
  */

import java.util.ArrayList;

public class BruteForce{
    public static void Intersection(int arr1[], int arr2[], int n, int m){
        int visited[] = new int[m];
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr1[i] == arr2[j] && visited[j] == 0){
                    ans.add(arr1[i]);
                    visited[j] = 1;
                    break;
                }

                if(arr2[j] > arr1[i])break;
            }
        }

        for(int nums : ans){
            System.out.print(nums + " ");
        }
        System.out.println();

    }
     public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;

        Intersection(arr1, arr2, n, m);

    }
}