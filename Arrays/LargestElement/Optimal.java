// Time complexity = O(n)
// Space Complexity = O(1)

public class Optimal{
   public static void findLargest(int[] arr){
    int largest = arr[0];
    for(int i = 0; i < arr.length; i++){
        if(arr[i] > largest){
            largest = arr[i];
        }
    }
    System.out.println("Largest: "+largest);

   }
    public static void main(String a[]){
        int arr[] = {3,2,1,5,2};

        findLargest(arr);
    }
}