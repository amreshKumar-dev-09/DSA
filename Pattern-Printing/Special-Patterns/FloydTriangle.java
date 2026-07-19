import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        if (rows <= 0) {
            System.out.println("Please enter a positive number");
            return; // stops the program here   
        }
        
        int a = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }

        
    }
}