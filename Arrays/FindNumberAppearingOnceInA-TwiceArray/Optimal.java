// Time Complexity = O(n)
// Space Complecity = O(n)

// Hash Array: O(n) Time, O(max) Space
// HashMap: O(n) Worst-case Time, O(n) Space
// TreeMap: O(n log n) Time, O(n) Space

public class Optimal{

    public static void Solution(int[] arr){
        int n  = arr.length;
        int xor = 0;

        for(int i = 0; i < n; i++){
            xor = xor^arr[i];
        }
        System.out.println("The number appearing once in a twice array is: "+xor);
    }
    
     public static void main(String[] args){
        int[] arr = {1,1,2,3,3,4,4,5,5};

        Solution(arr);
    }
}
