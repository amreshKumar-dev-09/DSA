// Time Complexity = O(n)
// Space complexity = O(1)

public class SortCheck{
   public static boolean Check(int[] arr){
      int n = arr.length;

     for(int i = 1; i < n; i++){
            if(arr[i] < arr[i - 1]){
                return false;

            }
       }

       return true;
    }
        
    public static void main(String a[]){
        int arr[] = {1,2,1,3,4,};

        if(Check(arr)){
            System.out.println("Array is sorted");
        }
        else{
              System.out.println("Array is not sorted");
        }
      
    }
}