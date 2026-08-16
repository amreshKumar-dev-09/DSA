import java.util.ArrayList;
import java.util.Scanner;

class Subsequence {

    boolean print(int[] arr, int i, int n, ArrayList<Integer> list, int k, int sum) {

        // Base case
        if (i == n) {
            if (sum == k) {
                System.out.println(list);
                return true;
            }
            return false;
        }

        // Take the current element
        list.add(arr[i]);
        if (print(arr, i + 1, n, list, k, sum + arr[i])) {
            return true;
        }

        // Backtrack
        list.remove(list.size() - 1);

        // Don't take the current element
        return print(arr, i + 1, n, list, k, sum);
    }
}

public class PrintOneSubsequenceSumK {

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

        Subsequence obj = new Subsequence();

        if (!obj.print(arr, 0, n, new ArrayList<>(), k, 0)) {
            System.out.println("No subsequence found.");
        }

        sc.close();
    }
}