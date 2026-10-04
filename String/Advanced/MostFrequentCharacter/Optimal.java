// Time complexity = O(n + 26) = O(n)
// Space Complexity = O(26) = O(1)

public class Optimal{
    public static void main(String[] args){
        String str = "raghav";
        int maxFreq = 0;
        char mostFrequent = str.charAt(0);

        int[] freq = new int[26];

        for(int i = 0; i < str.length(); i++){
            freq[str.charAt(i) - 'a']++;
        }

         for(int i = 0; i < freq.length; i++){
            if(freq[i] > maxFreq){
                maxFreq = freq[i];
                mostFrequent = (char) (i + 'a');
            }
        }

        System.out.println("Most Frequent Character is: "+mostFrequent + "  Frequency: " + maxFreq);

    }
}