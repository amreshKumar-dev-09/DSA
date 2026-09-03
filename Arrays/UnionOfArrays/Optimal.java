// Time Complexity = O(m + n)
// Space Complexity = O(m + n)


import java.util.ArrayList;

public class Optimal{
    public static void Union(int arr1[], int arr2[], int n, int m){
        int i = 0;
        int j = 0;

        ArrayList<Integer> union = new ArrayList<>();

        while(i < n && j < m){

            if(arr1[i] < arr2[j]){
                if(union.isEmpty() || union.get(union.size() - 1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;   
            }

            else if(arr2[j] < arr1[i]){
                if(union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }

            else{
                if(union.isEmpty() || union.get(union.size() - 1) != arr2[j])
                union.add(arr1[i]);
                    
                i++;
                j++;
            }
        }

        while(i < n){
            if(union.isEmpty() || union.get(union.size() - 1) != arr1[i])
                union.add(arr1[i]);
                i++;
            
        }

         while(j < m)
            if(union.isEmpty() || union.get(union.size() - 1) != arr2[j]){
                union.add(arr2[j]);
                j++;
            
        }

        for(int nums : union){
            System.out.print(nums + " ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {2, 3, 4, 4, 5, 11, 12};
        int n = arr1.length, m = arr2.length;

        Union(arr1, arr2, n, m);

    }
}