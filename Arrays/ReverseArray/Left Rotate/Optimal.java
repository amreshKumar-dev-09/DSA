// Left Rotate an array by one place
// Time Complexity: O(n)
// Auxiliary Space: O(1)   // extra memory used by the algorithm
// Total Space: O(n)       // includes the input array


public class Optimal{
    public static void Rotate(int[] arr){
        int n = arr.length;
        int temp = arr[0];

        for(int i = 1; i < n; i++){
            arr[i - 1] = arr[i];
        }
        arr[n - 1] = temp;

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};

        Rotate(arr);
    }
}
