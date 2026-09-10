public class SelectionSortUsingRecursion {

    public static void SelectionSort(int[] arr, int n, int i){
        if(i >= n - 2)return;

        int min = i;
        for(int j = i; j <= n - 1; j++){
            if(arr[min] > arr[j]){
                min = j;
            }
        }
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;

        SelectionSort(arr, n, i + 1);

    }
    public static void main(String a[]){

        int[] arr = {13,24,46,52,20,9};
        int n = arr.length;

        SelectionSort(arr, n, 0);

        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();
    }
    
}
