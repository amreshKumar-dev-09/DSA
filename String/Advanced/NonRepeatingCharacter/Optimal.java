// Time Complexity = O(n)
// Space Complexity = O(1)

public class Optimal {
    public static void main(String[] args){
        String str = "geeksforgeeks";

        int[] freq = new int[26];

        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }

        for(int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if(freq[ch - 'a'] == 1){
                System.out.println(ch);
                
            }
        }
    }
    
}
