public class BruteForce{

    public static void Rotate(int[] arr, int d){
        int n = arr.length;
        d = d%n;
        int[] temp = new int[d];

        for(int i = n - d; i < n; i++){
            temp[i - (n - d)] = arr[i];
        }

        // n - 1 - d = last index of the element we need to shift. 
        // Start from here and shift elements d positions to the right. 
        for(int i = n - d - 1; i >= 0; i--){
            arr[i + d] = arr[i];
        }

        for(int i = 0; i < d; i++){
            arr[i] = temp[i];
        }

        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};

        Rotate(arr, 3);
    }
}