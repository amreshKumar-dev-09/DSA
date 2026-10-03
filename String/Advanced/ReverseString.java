//Time Complexity  = O(n/2) = O(n)
//Space Complexity = O(1)

public class ReverseString{
    public static void main(String[] args){
        String str = "Amresh";
        StringBuilder sb = new StringBuilder(str);

        int i = 0;
        int j = sb.length() - 1;

        //sb.reverse();

        while(i < j){
            char ch1 = sb.charAt(i);
            char ch2 = sb.charAt(j);
            sb.setCharAt(i,ch2);
            sb.setCharAt(j,ch1);
            i++;
            j--;
        }
        
        System.out.println(sb);

       
    }
}
