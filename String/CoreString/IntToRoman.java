// Time Complexity = O(n)
// Space Complexity = O(n)

import java.util.HashMap;

public class IntToRoman {
    public static void main(String[] args){
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        String str = "VIII";
        int result = 0;

        for(int i = 0; i < str.length() - 1; i++){
            char ch1 = str.charAt(i);
            char ch2 = str.charAt(i + 1);

            if(map.get(ch1) < map.get(ch2)){
                result -= map.get(ch1);
            }

            else{
                result += map.get(ch1);
            }

        }
        result += map.get(str.charAt(str.length() - 1));

        System.out.println(result);


    }
    
}
