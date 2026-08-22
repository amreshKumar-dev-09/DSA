import java.util.ArrayList;
import java.util.Scanner;

class SubSet{
    public void sum(int[] arr,int i, int n, int sum, ArrayList<Integer> list){
        if(i == n){
         list.add(sum);
            return;
        }

        // Take 
        sum(arr, i+1, n, sum + arr[i], list);

        // Not Take
        sum(arr, i+1, n, sum, list);

    }

}

public class SubSetSum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the element of array: ");
        for(int i = 0; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        SubSet obj = new SubSet();
        ArrayList<Integer> list = new ArrayList<>();

        obj.sum(arr, 0, n, 0, list);

        System.out.println("Subset sums: " + list);


        sc.close();
        
    }
    
}
