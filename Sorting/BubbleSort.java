 public class BubbleSort{
 public static void sort(int[] arr){
        int n = arr.length;
        for(int i = n - 1; i >= 1; i--){

            for(int j = 0; j <= i - 1; j++){

                if(arr[j] > arr[j + 1]){
                     int temp = arr[j+1];
                     arr[j+1] = arr[j];
                     arr[j] = temp;

                }
                
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

        int[] arr = {9,13,24,46,52};

        sort(arr);

        print(arr);


    }
}
