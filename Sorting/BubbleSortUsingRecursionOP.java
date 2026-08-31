//Time Complexity: O(N2) for the worst and average cases and O(N) for the best case. Here, N = size of the array.
//Space Complexity: O(N) auxiliary stack space.


class Sorting{
     public void sort(int[] arr, int n){
        if(n == 1)return;

        int didswap = 0;

        for(int j = 0; j < n - 1; j++){
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                didswap = 1;
            }
        }

        if(didswap != 1){
            return;
        }
        else{
            sort(arr, n - 1);

        }

    }

}

public class BubbleSortUsingRecursionOP {
    public static void main(String a[]){

        int arr[] = {13,24,46,52,20,9};
        int n = arr.length;

        Sorting obj = new Sorting();
        obj.sort(arr, n);

        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();

    }
    
}
