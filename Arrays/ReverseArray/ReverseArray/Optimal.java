// Time Complexity = O(n)
// Space Complexity = O(1)

public class Optimal{

    public static void reverse(int[] arr){
        int n = arr.length;

        int i = 0;
        for(int j = n - 1; j >= 0; j--){
            if(i < j){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

                i++;
            }
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