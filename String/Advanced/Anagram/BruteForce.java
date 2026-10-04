// Time Complexity = O(n) + O(n log n) + O(n log n) + O(n) = O(n log n)
// Space Complexity = O(n)


import java.util.Arrays;

public class BruteForce{
    public static void main(String a[]){
        String s1 = "listen";
        String s2 = "silent";
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean IsAngram = true;

        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                IsAngram = false;
            }
        }

        if(IsAngram){
            System.out.println(s1 + " and " + s2 + " are anagram");
        }
        else{
            System.out.println(s1 + " and " + s2 + " are not anagram");

        }
        

 }
}
