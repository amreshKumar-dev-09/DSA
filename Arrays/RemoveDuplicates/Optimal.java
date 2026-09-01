// Time 0omplexity = O(n)
// Space Complexity = O(1)


public class Optimal{
    public static void removeDuplicates(int[] arr){
        int n = arr.length;

        int index = 0;
        for(int j = 0; j < n; j++){
            if(arr[j] != arr[index]){
                arr[index + 1] = arr[j];
                index++;
            }
        }

        for(int i = 0; i <= index; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args){

        int arr[] = {0,0,1,1,1,2,2,3,3,4};

        removeDuplicates(arr);

    }
}