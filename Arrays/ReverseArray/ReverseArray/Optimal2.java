// Time Complexity = O(n)
// Space Complexity = O(1)

public class Optimal2{

    public static void reverse(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }

        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();

    }

    public static void main(String[] args){

        int[] arr = {1,2,3,4,5};

        reverse(arr);

    }

}