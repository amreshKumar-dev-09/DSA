// Time Complexity = O(n^2) for worst and average case.
// Time Complexity = O(n) for best case.
// Space Complexity = O(1). 

public class InsertionSort {
    public static void sort(int[] arr){
        int n = arr.length;
        for(int i = 0; i <= n - 1; i++){

            int j = i;
            while(j > 0 && arr[j - 1] > arr[j]){

                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;    

                j--;
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

        int[] arr = {23,1,10,5,2};

        sort(arr);

        print(arr);


    }
}


