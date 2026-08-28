// Time Complexity = O(n^2) for all cases
// Space Complexity = O(1)

public class SelectionSort{

    public static void sort(int[] arr){
        for(int i = 0; i <= arr.length - 2; i++){

            int min = i;

            for(int j = i; j <= arr.length-1; j++){

                if(arr[j] < arr[min]){
                    //if(arr[j] < arr[min] for dorting in descending order.
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

    }

    public static void print(int[] arr){
         for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
     
    public static void main(String a[]){

        int[] arr = {9,13,24,46,52};

        sort(arr);

        print(arr);


    }
}