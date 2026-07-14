import java.util.Scanner;

public class MagnitudeComparison {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num = sc.nextInt();

        // Absolute value
        int absNum = (num < 0) ? -num : num;

        if (absNum < 69) {
            System.out.println(num + " is lesser than 69");
        } else if (absNum > 69) {
            System.out.println(num + " is greater than 69");
        } else {
            System.out.println(num + " is equal to 69");
        }

        sc.close();
    }
}
