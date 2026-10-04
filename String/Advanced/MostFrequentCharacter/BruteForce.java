// Time Complexity = O(n^n)
// Space Complexity = O(1)

public class BruteForce{
    public static void main(String[] args){
        String str = "raghav";
        int maxFreq = 0;
        char mostFrequent = str.charAt(0);

        for(int i = 0; i < str.length(); i++){

            int count = 0;
            char ch = str.charAt(i);

            for(int j = 0; j < str.length(); j++){
                char c = str.charAt(j);
                if (ch == c) {
                 count++;
                } 
            }

            if(count > maxFreq){
                    maxFreq = count;
                    mostFrequent = str.charAt(i);
                }
        }

        System.out.println("Most Frequent Character is: "+mostFrequent + "  Frequency: " + maxFreq);
    }
}