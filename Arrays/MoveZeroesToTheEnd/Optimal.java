// Time Complexity = O(n)
// Space Complexity = O(1)

public class Optimal{
    public static void MoveZeroesToEnd(int[] arr){
        int n = arr.length;

        int i = 0; 
        for(int j = 0;  j < n;  j++){
            if(arr[j] != 0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                
                i++;
            }
        }

        for(int nums : arr){
            System.out.print(nums + " ");
        }
        System.out.println();
        
    }
    
     public static void main(String a[]){
        int arr[] = {1,0,2,3,2,0,0,4,5,1};

        MoveZeroesToEnd(arr);

    }
}