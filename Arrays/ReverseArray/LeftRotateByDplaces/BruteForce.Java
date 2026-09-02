// Time Complexity = O(n)
// Space Complexity = O(n)


public class BruteForce{

    public static void Rotate(int[] arr, int d){
        int n = arr.length;
        int temp[] = new int[n];

        int j = 0;
        for(int i = 0; i < d; i++){
            temp[j] = arr[i];
            j++;
        }

        for(int i = d; i < n; i++){
            arr[i - d] = arr[i];
        }

         j = 0;
        for(int i = n - d; i < n; i++){
            arr[i] = temp[j];
            j++;
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
