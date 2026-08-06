import java.util.ArrayList;
import java.util.Scanner;

class Subsequences{
    void print(int[] arr,int i,int n,ArrayList<Integer> list){
        if (i >= n){
            System.out.println(list);
            return;
        }

            list.add(arr[i]);
            print(arr,i+1,n,list);

            list.remove(list.size() - 1);
            print(arr,i+1,n,list);


    }
}

public class PrintSubsequences {
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array: ");
        int n = sc.nextInt();

       int[] arr = new int[n];

        System.out.println("Enter array elements: ");
        for(int i = 0; i <= n-1; i++){
            arr[i] = sc.nextInt();
        }

        Subsequences obj = new Subsequences();
        obj.print(arr, 0, n, new ArrayList<>());


        


    }
    
}
