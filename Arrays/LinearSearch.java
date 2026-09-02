// Time complexity = O(n)
// Space Complexity = O(1)

public class LinearSearch {
    public static void Search(int arr[], int digit){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == digit){
                System.out.println(digit + " found at index " + i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,7,8,4,1};
        Search(arr,8);
        
    }
}
