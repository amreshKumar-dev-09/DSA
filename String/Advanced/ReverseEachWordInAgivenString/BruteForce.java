// Time Complexity = O(n)
// Space Complexity = O(n)

public class BruteForce{
    public static void main(String[] args){
        String str = "Java is easy";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(String word : words){
            char[] arr = word.toCharArray();

            int i = 0;
            int j = word.length() - 1;

            while(i < j){
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                i++;
                j--;
            }
            sb.append(arr).append(" ");
        }

        System.out.println(sb);

    }
}