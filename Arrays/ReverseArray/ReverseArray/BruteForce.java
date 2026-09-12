// Time Complexity = O(n)
// Space Complexity = O(n) 

public class BruteForce{

    public static void reverse(int[] arr){
        int n = arr.length;

        int[] temp = new int[n];

        for(int i = 0; i < n; i ++){
            temp[i] = arr[n - i - 1];
        }

        for(int i = 0; i < n; i ++){
            arr[i] = temp[i];
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