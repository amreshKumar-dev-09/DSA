import java.util.Scanner;

class PalindromCheck{
    boolean check(int i, String str){

        if(i >= str.length()/2)
            return true;

        if(str.charAt(i) != str.charAt(str.length() - i -1))
            return false;

        return check(i+1,str);
        

    }
    
}

public class StringPalindromCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        PalindromCheck obj = new PalindromCheck();
        

        if(obj.check(0, str))
            System.out.println("Palindrom");
        
        else
            System.out.println("Not Palindrom");
    }
    
}
