// Time Complexity = O(n)
// Space Complexity = O(1)

public class ThirdLargest {
    public static void FindThirdLargest(int[] arr){
        int n = arr.length;
        int Largest = arr[0];
        int SecondLargest = Integer.MIN_VALUE;
        int ThirdLargest = Integer.MIN_VALUE;

        for(int i = 1; i < n; i++){

            if(arr[i] > Largest){
                ThirdLargest = SecondLargest;
                SecondLargest = Largest;
                Largest = arr[i];
            }

            else if(arr[i] < Largest && arr[i] >  SecondLargest){
                ThirdLargest =  SecondLargest;
                SecondLargest = arr[i];
            }

            else if(arr[i] < Largest && arr[i] < SecondLargest && arr[i] > ThirdLargest){
                ThirdLargest = arr[i];
            }
        }

        System.out.println("Third Largest: "+ThirdLargest);

    }
    
    public static void main(String[] args){
        int arr[] = {1,2,4,7,7,5};

        FindThirdLargest(arr);
    }
    
}
 
    

