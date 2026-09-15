// Time Complexity = O(n^2)
// Space Complexity = O(1) as we use a constant amount of extra space regardless of input size.


public class BruteForce{

    public static boolean TwoSumExists(int[] arr, int target, int n){

        for(int i = 0; i < n; i++){
        
            for(int j = 0; j < n; j++){

              if(i == j)continue;

              if(arr[i] + arr[j] == target){
                 return true;
                }          
            }
        }
            
        return false;
        
    }

    public static int[] TwoSumIndices(int arr[], int target, int n){

         for(int i = 0; i < n; i++){
        
            for(int j = 0; j < n; j++){

                if(i == j)continue;

              if(arr[i] + arr[j] == target){
                 return new int[] {i , j};
                }          
            }
        }

        return new int[] {-1 , -1};

    }


    public static void main(String[] args){
        int arr[] = {2,6,5,8,11};
        int n = arr.length;
        int target = 14;

        System.out.println(TwoSumExists(arr, target, n));

        int result[] = TwoSumIndices(arr, target, n);
        System.out.println("[" +  result[0] + " " + result[1] +"]");


    }

}