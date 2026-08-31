// Brute Force Appproach

class sorting{
    public void sort(int[] arr, int n){
        if(n == 1)return;

        for(int j = 0; j < n - 1; j++){
            if(arr[j] > arr[j + 1]){
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        sort(arr, n - 1);

    }

}

public class BubbleSortUsingRecursion{
    public static void main(String[] args){

        int arr[] = {13,24,46,52,20,9};
        int n = arr.length;

        sorting obj = new sorting();
        obj.sort(arr, n);

        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();

    }
}