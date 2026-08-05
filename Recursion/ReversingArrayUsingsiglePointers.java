import java.util.Scanner;

class ReverseArray{
    void reverse(int[] arr,int l, int n){

        if(l >= n/2){
            return;
        }

        int temp = arr[l];
        arr[l] = arr[n-l-1];
        arr[n-l-1] = temp;

        reverse(arr,l + 1,n);
    }

}



public class ReversingArrayUsingsiglePointers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements of array: ");
        for(int i = 0; i <= n - 1; i++){
            arr[i] = sc.nextInt();
        }

        ReverseArray obj = new ReverseArray();
        obj.reverse(arr, 0, n);

        System.out.print("Reversed array: ");
        for(int num : arr){
            System.out.print(num + " ");
        }

        sc.close();;
    }
    
}
