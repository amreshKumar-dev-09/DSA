// Time Complexity = O(n * d)
// Space Complexity = O(1)


public class BruteForce{

    public static void Rotate(int arr[], int d){
        int n = arr.length;

        for(int i = 0; i < d; i++){
            int temp = arr[0];

            for(int j = 1; j < n; j++){
                arr[j - 1] = arr[j];
            }
            arr[n - 1] = temp;
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