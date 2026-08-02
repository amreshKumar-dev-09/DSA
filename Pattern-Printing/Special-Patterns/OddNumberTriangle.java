/*
Enter number of rows: 5
1
1 3
1 3 5
1 3 5 7
1 3 5 7 9 

*/

import java.util.Scanner;

public class OddNumberTriangle {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        sc.close();

        if (rows <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((2 * j - 1) + " ");
            }
            System.out.println();
        }
    }
}