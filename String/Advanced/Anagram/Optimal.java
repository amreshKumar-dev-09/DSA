// Time Complexity = O(n)
// Space Complexity = O(1)

public class Optimal{
    public static void main(String a[]){
        String s1 = "listen";
        String s2 = "silent";

        boolean IsAngram = true;

        if(s1.length() != s2.length()){
            IsAngram = false;
        }

        int[] freq = new int[26];

        for(int i = 0; i < s1.length(); i++){
            freq[s1.charAt(i) - 'a']++;
        }

        for(int i = 0; i < s1.length(); i++){
            freq[s2.charAt(i) - 'a']--;
        }

        for(int values : freq){
            if(values != 0){
                IsAngram = false;
                break;
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