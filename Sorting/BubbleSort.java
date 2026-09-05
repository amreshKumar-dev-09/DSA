// Time Complexity = O(n^2) for worst and average case.
// Time Complexity = O(n) for best case.
// Space Complexity = O(1). 
 
 public class BubbleSort{
 public static void sort(int[] arr){
        int n = arr.length;
        for(int i = n - 1; i >= 1; i--){
            int didswap = 0;

            for(int j = 0; j <= i - 1; j++){

                if(arr[j] > arr[j + 1]){ //if(arr[j] > arr[j + 1]) for descending order.
                     int temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                     didswap = 1;
                }
                
            }

            if(didswap == 0){
                break;
            }
        }
    }


    public static void print(int[] arr){
         for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
     
    public static void main(String a[]){

        int[] arr = {13,24,46,52,20,9};

        sort(arr);

        print(arr);


    }
}
