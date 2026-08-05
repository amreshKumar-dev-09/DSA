import java.util.Scanner;

class ReverseArray{
    void reverse(int[] arr,int l, int r){

        if(l >= r)
            return;

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverse(arr, l+1, r-1);

    }
}

public class ReversingArrayUsingTwoPointers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int [] arr = new int[n];

        System.out.print("Enter elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ReverseArray obj = new ReverseArray();
        obj.reverse(arr, 0, n - 1);

        System.out.println("Reversed Array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();

    }
    
}
