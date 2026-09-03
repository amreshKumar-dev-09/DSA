// Time Complexity = O(m + n)
// Space Complexity = O(1)
// Arrays must be sorted in this problem.

public class Optimal{
    public static void Intersection(int arr1[], int arr2[], int n, int m){
        int i = 0; 
        int j = 0;

        while(i < n && j < m){

            if(arr1[i] < arr2[j]){
                i++;
            }

            else if(arr2[j] < arr1[i]){
                j++;
            }
            
            else{
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        System.out.println();

        }

    public static void main(String[] args){
        int[] arr1 = {1, 2, 2, 3, 3, 4, 5, 6};
        int[] arr2 = {2, 3, 3, 5, 6, 7};
        int n = arr1.length, m = arr2.length;

        Intersection(arr1, arr2, n, m);

    }
}