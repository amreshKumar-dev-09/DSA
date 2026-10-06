// Time Complexity = O(n)
// Space Complexity = O(2n) = O(n)

import java.util.HashMap;

public class Optimal{
    public static void main(String[] args){
        String s = "egg";
        String t = "add";

        boolean isIsomorphic = true;

        HashMap<Character,Character> mapS = new HashMap<>();
        HashMap<Character,Character> mapT = new HashMap<>();

        if(s.length() != t.length()){
            isIsomorphic = false;
        }

        else{
            for(int i = 0; i < s.length(); i++){

             char chS = s.charAt(i); 
             char chT = t.charAt(i);

             if(mapS.containsKey(chS) && mapS.get(chS) != chT){
                 isIsomorphic = false;
                }

             if(mapT.containsKey(chT) && mapT.get(chT) != chS){
                 isIsomorphic = false;
                }

             mapS.put(chS, chT);
             mapT.put(chT, chS);

            }

        }
        
        System.out.println(isIsomorphic);

    }
}