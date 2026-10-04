// Time Complexity = O(n)
// Space Complexity = O(n)

import java.util.HashMap;

public class Better {
    public static void main(String a[]){
        String s1 = "listen";
        String s2 = "silent";

        boolean IsAngram = true;

        if(s1.length() != s2.length()){
            IsAngram = false;
        }

        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            freq.put(s1.charAt(i), freq.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i < s1.length(); i++){
            char ch = s2.charAt(i);
            freq.put(s1.charAt(i), freq.getOrDefault(ch, 0) - 1);
        }

        for(int values : freq.values()){
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
