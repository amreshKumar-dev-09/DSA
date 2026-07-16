import java.util.Scanner;

/**
 * This program prints the first n terms of an Arithmetic Progression (AP)
 * where:
 * First term (a) = 2
 * Common difference (d) = 3
 * Formula: a_n = 3n - 1
 */
public class APUsingLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Generating AP using loop
        System.out.println("AP series:");
        for (int i = 2; i <= 3 * n - 1; i += 3) {
            System.out.print(i + " ");
        }

        sc.close(); // Closing scanner to avoid resource leak
    }
}

