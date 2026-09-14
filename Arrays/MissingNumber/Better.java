// Time Complexity = O(n)
// Space Complexity = O(n)

public class Better{
     public static void FindMissingNumber(int[] arr, int n){
        int hash[] = new int[n + 2];

        /*I use the number itself as the hash-array index. I mark existing elements as 1,
        and the index whose value remains 0 represents the missing number.
        ince the expected range goes up to n+1 and Java indexing starts from 0, the array size is n+2.*/

        for(int i = 0; i < n; i++){
            hash[arr[i]] = 1;
        }

        for(int i = 1; i <= n + 1; i++){
            if(hash[i] == 0){
                System.out.println("The missing element is: "+i);
                break;
            }
        }
    }
    
    public static void main(String[] args){
        int arr[] = {1,2,3,5};
        int n = arr.length;

        FindMissingNumber(arr, n);

    }
}