import java.util.HashMap;
import java.util.Map;

public class Better{
    public static void main(String[] args){
        String str = "Raghav";
        int maxFreq = 0;
        char mostFrequent = str.charAt(0);

        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            freq.put(str.charAt(i), freq.getOrDefault(ch,0) + 1);
        }

         for (Map.Entry<Character, Integer> entry : freq.entrySet()) {

            if (entry.getValue() > maxFreq) {
                maxFreq = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }
        System.out.println("Most Frequent Character is: "+mostFrequent + "  Frequency: " + maxFreq);
    }
}