// Time complexity = O(n)
// Space Complexity = O(n)


import java.util.ArrayList;

public class BruteForce{

    public static void MoveZeroesToEnd(int arr[]){
        ArrayList<Integer> temp = new ArrayList<>();
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] != 0){
                temp.add(arr[i]);
            }
        }

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                temp.add(arr[i]);
            }

        }

        for (int i = 0; i < n; i++) {
            arr[i] = temp.get(i);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }

    }

    public static void main(String a[]){
        int arr[] = {1,0,2,3,2,0,0,4,5,1};

        MoveZeroesToEnd(arr);

    }
}