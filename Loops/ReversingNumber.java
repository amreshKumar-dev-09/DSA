import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Digit: ");
        int n = sc. nextInt();

        int lastdigit = 0;
        int reverse = 0;

        while(n != 0){

            lastdigit = n%10;

            // Overflow check
            if (reverse > Integer.MAX_VALUE / 10 || 
                reverse < Integer.MIN_VALUE / 10) {
                System.out.println("Overflow occurred. Cannot reverse safely.");
                sc.close();
                return;
            }
            
            reverse = reverse*10 + lastdigit;
            n = n/10;
        }
        
    }


        
}