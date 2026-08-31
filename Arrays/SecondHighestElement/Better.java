//Time Complexity = O(2n)
//Space Complexity = O(1)

public class Better {

     public static void findSecondHighest(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        int SecondL = -1;

        for(int i = 0; i < n; i++)
        {
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

        for(int i = 0; i < n; i++)
        {
            if(arr[i] > SecondL && arr[i] != largest){
                SecondL = arr[i];
            }
        }
        System.out.println("Second Largest: "+SecondL);
    }

    public static void main(String[] args) {

        int arr[] = {1,2,4,7,7,5};
        findSecondHighest(arr);
        
    }
}
