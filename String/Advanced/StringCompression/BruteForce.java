// Time Complexity = O(n)
// Space Complexity = O(1)


public class BruteForce{
    public static void main(String a[]){
        String str = "aaacccbbbbb";

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            int count = 1;
            for(int j = i+1; j < str.length(); j++){
                char c = str.charAt(j);
                if(ch == c){
                    count++;
                    i++;
                }
                else{
                    break;
                }
            }
            System.out.print(ch + "" + count + " ");
        }
        System.out.println();
    }
}