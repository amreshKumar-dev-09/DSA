import java.util.Scanner;

public class PalindromCheck {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int x = sc.nextInt();

        int original = x;   // store original number
        int reverse = 0;

        while (x > 0) {
            int digit = x % 10;
            reverse = reverse * 10 + digit;
            x = x / 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}