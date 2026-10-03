// Time Complexity = O(n*n)
// Space Complexity = O(1)

public class PrintAllSubStrings {
    public static void main(String[] args){
        String str = "Amresh";

        for(int i = 0; i < str.length(); i++){

            for(int j = i + 1; j <= str.length(); j++){
               System.out.print(str.substring(i, j) + " ");

            }
            System.out.println();
        }
        
    }
    
}
