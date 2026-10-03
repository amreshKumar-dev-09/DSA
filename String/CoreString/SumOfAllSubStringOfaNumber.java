


class SubsString{
    // Time Complexity = O(n^3)
    // Space Complexity = O(1)

    public void approach1(String str){
        int sum = 0;
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j <= str.length(); j++){
                System.out.print(str.substring(i,j) + " ");
                sum += Integer.parseInt(str.substring(i,j));

            }
            System.out.println();

        }
        System.out.println("The sum of all substrings is: "+sum);
    }

    public void approach2(String str){
        // Time Complexity = O(n)
        // Space Complexity = O(1)

        int current = 0; 
        int sum= 0;

        for(int i = 0; i < str.length(); i++){
            int digit = str.charAt(i) - '0';

            current = current * 10 + digit * (i + 1);
            sum += current;
        }
        System.out.println("The sum of all substrings is: " + sum);

    }
}

public class SumOfAllSubStringOfaNumber {
    public static void main(String[] args) {
        String str = "123";

        SubsString obj = new SubsString();
        obj.approach2(str);        
        obj.approach1(str);        


      
    }
    
}
