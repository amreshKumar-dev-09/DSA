//Time Complexity: O(N2), (where N = size of the array), for the worst, and average cases.
//Space Complexity: O(N) auxiliary stack space.

class Sorting{
    public void sort(int[] arr, int n, int i){
        if(i == n)return;

        int j = i;
        while(j > 0 && arr[j - 1] > arr[j]){
            int temp = arr[j - 1];
            arr[j - 1] = arr[j];
            arr[j] = temp;

            j--;
        }

        sort(arr, n, i + 1);

    }
}

public class InsertionSortUsingRecursion {
    public static void main(String a[]){

        int arr[] = {13,24,46,52,20,9};
        int n = arr.length;

        Sorting obj = new Sorting();
        obj.sort(arr, n, 0);

        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();
    }
    
}
