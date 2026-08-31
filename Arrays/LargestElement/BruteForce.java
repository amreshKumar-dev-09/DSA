public class BruteForce{

    public static int findLargest(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            boolean isLargest = true;

            for (int j = 0; j < arr.length; j++) {

                if (arr[j] > arr[i]) {
                    isLargest = false;
                    break;
                }
            }

            if (isLargest) {
                return arr[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int arr[] = {3, 2, 1, 5, 2};

        System.out.println("Largest: " + findLargest(arr));
    }
}