// Time Complexity  = O(1)  -> fixed 13 values and bounded iterations
// Space Complexity = O(1)  -> fixed arrays and bounded StringBuilder output

public class RomanToInt {
    public static void main(String[] args){
       int num = 58;

       int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

       String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

       StringBuilder sb = new StringBuilder();

        for(int i = 0; i < values.length; i++){

            while(num >= values[i]){
              sb.append(symbols[i]);
              num -= values[i];
            }
        }
        System.out.println(sb);
    }
}

