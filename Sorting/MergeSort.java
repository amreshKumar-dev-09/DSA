import java.util.ArrayList;

// Time Complexity = O(n log n) for all cases
// Space Complexity = O(n)

public class MergeSort{

    public static void merge(ArrayList<Integer> arr , int low, int high, int mid){
        ArrayList<Integer> temp = new ArrayList<>();

        int left = low;
        int right = mid + 1;

        while(left <= mid && right <= high){
          if(arr.get(left) <= arr.get(right)){
            temp.add(arr.get(left));
            left++;
          }
          else{
            temp.add(arr.get(right));
            right++;
          }
        }

        while(left <= mid){
            temp.add(arr.get(left));
            left++;
        }

        while(right <= high){
            temp.add(arr.get(right));
            right++;
        }

        for(int i = low; i <= high; i++){
            arr.set(i, temp.get(i - low));
        }


    }

    public static void sort(ArrayList<Integer> arr , int low, int high){
        if(low == high)return;
        int mid = (low+high)/2;

        sort(arr, low, mid);
        sort(arr, mid+1, high);
        merge(arr, low, high, mid);

    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(4);
        arr.add(3);
        arr.add(2);
        arr.add(1);

        int n = arr.size();

        sort(arr, 0, n - 1);

        System.out.println(arr);



        
    }
}