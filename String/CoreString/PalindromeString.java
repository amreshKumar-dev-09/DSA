// Time Complexity = O(n/2) = O(n)
// Space Complexity = O(1)

public class PalindromeString {
    public static void main(String[] arts){
        String str = "racecar";
        int i = 0;
        int j = str.length() - 1;
        boolean Ispalindrom = true;

        while(i < j){
            
            if(str.charAt(i) != str.charAt(j)){
                Ispalindrom = false;
                break;
            }

            i++;
            j--;


        }
        
        if(Ispalindrom){
            System.out.println(str + " is Palindrom");
        }
        else{
            System.out.println(str + " is not Palindrom");
        }

        
    }
    
} 
