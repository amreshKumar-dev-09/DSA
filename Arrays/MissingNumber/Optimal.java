// Time Complexity = O(n)
// Space Complexity = O(1)

public class Optimal{
    public static void FindMissingNumber(int[] arr, int n){
        int sum = 0;

        for(int i = 0; i < n - 1; i++){
            sum += arr[i];
        }

        int expSum = n*(n + 1)/2;
        int missingNumber = expSum - sum ;

        System.out.println("The missing element is: "+missingNumber);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int n = arr.length + 1;

        FindMissingNumber(arr, n);
    }
}