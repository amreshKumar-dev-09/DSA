// Time Complexity = O(n^2)
// Space Complecity = O(1)

public class BruteForce{
    public static void main(String[] args){
        String s = "egg";
        String t = "add";

        boolean isIsomorphic = true;

        for(int i = 0; i < s.length(); i++){

            int prevS = -1;
            int prevT = -1;

            for(int j = 0; j < s.length(); j++){
                if(s.charAt(i) == s.charAt(j)){
                    prevS = j;
                    break;
                }
            }

            for(int j = 0; j < t.length(); j++){
                if(t.charAt(i) == t.charAt(j)){
                    prevT = j;
                    break;
                }
            }
            
            if(prevS != prevT){
                isIsomorphic = false;
                break;
            }

        }

         System.out.println(isIsomorphic);
    }
}