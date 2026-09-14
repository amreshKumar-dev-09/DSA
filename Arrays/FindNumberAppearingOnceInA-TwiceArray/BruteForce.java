// Time Complexity = O(n*n)
// Space Complexity = O(1)

public class BruteForce{

    public static void Solution(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n; i++){
            int count = 0;

            for(int j = 0; j < n; j++){

                if(arr[j] == arr[i]){
                    count++;
                }
            }

            if(count == 1){
                System.out.println("The number appearing once in a twice array is: "+arr[i]);   
            }           
        }
        
    }

    public static void main(String[] args){
        int[] arr = {1,1,2,3,3,4,4,5,5};

        Solution(arr);
    }
}