import java.util.Scanner;

public class SymmetricNumberPattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        // Outer loop → controls rows
        for(int i = 1; i <= n; i++){

            // Left side → increasing numbers (1 to i)
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }

            // Middle → spaces (should depend on i for symmetry)
            for(int j = 1; j <= 2*(n-i); j++){
                System.out.print(" ");
            }

            // Right side → decreasing numbers (i to 1)
            for(int j = i; j >= 1; j--){
                System.out.print(j);
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}