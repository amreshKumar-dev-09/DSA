public class countArrayFreq2 {
    public static void main(String a[]){

        int[] arr = {1,2,1,2,3};

        int hash[] = new int[13];

        for(int i = 0; i < arr.length; i++){
            hash[arr[i]]++;
        }

         for (int i = 0; i < hash.length; i++) {
            if (hash[i] > 0) {
                System.out.println(i + " occurs " + hash[i] + " times");
            }
        }
    }
    
}
