import java.util.ArrayList;
import java.util.Scanner;

class Subsequence{
    void print(int[] arr,int i, int n ,ArrayList<Integer> list){

        if(i >= n){
            System.out.println(list);
            return;
        }

        list.add(arr[i]);
        print(arr, i+1, n, list);

        list.remove(list.size() - 1);
        print(arr, i+1, n, list);

    }
}


public class SubsequencePrinting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        Subsequence obj = new Subsequence();
        obj.print(arr, 0, n, new ArrayList<Integer>());

        sc.close();
        
    }
}