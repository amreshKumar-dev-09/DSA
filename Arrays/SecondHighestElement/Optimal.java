// Time Complexity = O(n)
// Space Complexity = O(1)

public class Optimal {

    public static void findSecondLargest(int[] arr){
        int n = arr.length;
        int largest = arr[0];
        int Slargest = -1;

        for(int i = 0; i < n; i++){
            if(arr[i] > largest){
                Slargest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > Slargest){
                Slargest = arr[i];
            }
        }

        System.out.println("Second Largest: "+Slargest);
    }

    public static void findSecondSmallest(int[] arr){
        int n = arr.length;
        int Smallest = arr[0];
        int Ssmallest = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            if(arr[i] < Smallest){
                Ssmallest = Smallest;
                Smallest = arr[i];
            }
            else if(arr[i] > Smallest && arr[i] < Ssmallest){
                Ssmallest = arr[i];
            }
        }

        System.out.println("Second Largest: "+Ssmallest);

    }
    public static void main(String[] args){
        int arr[] = {1,2,4,7,7,5};

        findSecondLargest(arr);
        findSecondSmallest(arr);
    }
    
}
