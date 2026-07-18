import java.util.Scanner;

public class AlphabetTriangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive number");
        }

        // Pattern 1: A B C
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)('A' + j - 1) + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Pattern 2: A, B B, C C C
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)('A' + i - 1) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}