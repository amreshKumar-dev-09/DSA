import java.util.ArrayList;
import java.util.Scanner;

class CountSubsequence {

    int count(int[] arr, int i, int n, ArrayList<Integer> list, int k, int sum, int c) {

        // Base case
        if (i == n) {
            if (sum == k) {
                System.out.println(list);
                return 1;
            }
             return 0;
        }

        // Take the current element
        list.add(arr[i]);
        int l = count(arr, i + 1, n, list, k, sum + arr[i], c);
        

        // Backtrack
        list.remove(list.size() - 1);

        // Don't take the current element
        int r = count(arr, i + 1, n, list, k, sum,c);

        return l+r;
    }
}

public class CountSubsequencesSumK {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        CountSubsequence obj = new CountSubsequence();


        System.out.println("Count is: "+obj.count(arr, 0, n, new ArrayList<>(), k, 0,0));

        sc.close();
    }
    
}
