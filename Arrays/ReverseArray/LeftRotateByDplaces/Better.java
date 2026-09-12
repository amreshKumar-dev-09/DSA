// Time Complexity = O(n + d)
// Space Complexity = O(n)

public class Better{

    public static void Rotate(int arr[], int d){
        int n = arr.length;
        int[] temp = new int[n];
        d = d%n;

        // Store first d elements
        for(int i = 0; i < d; i++){
            temp[i] = arr[i];
        }

        // Shift remaining elements
        for(int i = d; i < n; i++){
            arr[i - d] = arr[i];
        }

        // Put stored elements at the end
        for(int i = n - d; i < n; i++){
            arr[i] = temp[i - (n - d)];
        }

        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();

        
    }


    public static void main(String[] args){
        int arr[] = {1,2,3,4,5,6,7};
        Rotate(arr, 3);
        
    }
}