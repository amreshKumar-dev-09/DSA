import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num < 0) {
            num = -num;   // convert negative to positive
        }

        System.out.println("Absolute value is: " + num);

        sc.close();
    }
}