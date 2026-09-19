// Time Complexity = O(n)
// Space complexity = O(1)

public class PrintCharactersAtIndex{
    public static void print(String str){
     int n = str.length();

        for(int i = 0; i < n; i++){

         System.out.println(str.charAt(i));
            
        }
    }
    
    public static void main(String[] args){

        String str = "Amresh Kumar";
        print(str);
        
    }
}