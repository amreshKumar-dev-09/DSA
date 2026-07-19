import java.util.Scanner;

public class BinaryTriangle {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        sc.close();

        if (rows <= 0) {
            System.out.println("Please enter a positive number");
            return; // stops the program here   
        }
        

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if((i + j)%2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

    }
    
}
