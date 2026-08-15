import java.util.Scanner;
import java.util.ArrayList;

class Subsequence{
    void print(int[] arr,int i, int n ,ArrayList<Integer> list,int k,int sum){

        if(i == n){
            if(sum == k)
            System.out.println(list);
            return;
        }

        list.add(arr[i]);
        sum += arr[i];
        print(arr,i + 1,n,list,k,sum);

        list.remove(list.size() - 1);
        sum -= arr[i];
        print(arr, i+1, n, list,k,sum);

    }
}

public class SumOfKsubsequences{
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
        obj.print(arr, 0, n, new ArrayList<Integer>(), 2, 0);

        sc.close(); 
    }
}