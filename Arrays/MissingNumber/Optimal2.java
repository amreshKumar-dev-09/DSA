// Time Complexity = O(n)
// Space Complexity = O(1)

/* Summation: O(n) time, O(1) space, but can cause integer overflow when n is large, e.g. 10⁵.
XOR: O(n) time, O(1) space, and avoids integer overflow because it doesn't calculate a large sum.
Therefore, XOR is generally preferred when choosing between the two. */

public class Optimal2 {
     public static int FindMissingNumber(int[] arr, int N){
        int XOR1 = 0;
        int XOR2 = 0;  

        for(int i = 0; i < arr.length; i++){
            XOR2 = XOR2 ^ (arr[i]);
            XOR1= XOR1 ^ (i + 1);
        }

        XOR1 = XOR1 ^ N;

        return XOR1 ^ XOR2;
     }

      public static void main(String[] args) {
        int arr[] = {1,2,3,5};
        int N = arr.length + 1;

        int result = FindMissingNumber(arr, N);

        System.out.println("The missing element is: "+result);

    }
}
