//Time Complexity: O(n)
//Auxiliary Space: O(1)
//The StringBuilder itself requires O(n) storage.

public class Optimal{
    public static void main(String[] args){
        String str = "Java is easy";
        StringBuilder sb = new StringBuilder(str);

        int start = 0;

        for (int i = 0; i <= sb.length(); i++){

            if(i == sb.length() || sb.charAt(i) == ' '){

                int left = start;
                int right = i - 1;

                while(left < right){
                    char ch = sb.charAt(left);
                    sb.setCharAt(left, sb.charAt(right));
                    sb.setCharAt(right,ch);

                    left++;
                    right--;
                }
                start = i + 1;
            }
        }

        System.out.println(sb + " ");
    }
}