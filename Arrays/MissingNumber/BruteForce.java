// Time Complexity = O(n^2)
// Space Complexity = O(1)

public class BruteForce{
    public static void FindMissingNumber(int[] arr, int n){

        for(int i = 1; i <= n; i++){
            boolean found = false;
            for(int j = 0; j < n; j++){
                if(arr[j] == i){
                    found = true;
                }
            }

            if(!found){
             System.out.println("The missing element is: "+i);
            }
           
        }
    }

    public static void main(String[] args){
        int arr[] = {1,2,3,5};
        int n = arr.length;

        FindMissingNumber(arr, n);

    }
}