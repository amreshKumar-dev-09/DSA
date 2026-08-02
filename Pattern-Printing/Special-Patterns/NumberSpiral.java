/*
Enter no of rows: 5
1 1 1 1 1 1 1 1 1 
1 2 2 2 2 2 2 2 1 
1 2 3 3 3 3 3 2 1 
1 2 3 4 4 4 3 2 1 
1 2 3 4 5 4 3 2 1 
1 2 3 4 4 4 3 2 1 
1 2 3 3 3 3 3 2 1 
1 2 2 2 2 2 2 2 1 
1 1 1 1 1 1 1 1 1 

*/

import java.util.Scanner;

public class NumberSpiral {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int r = sc.nextInt();

        sc.close();

        if (r <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        for (int i = 1; i <= 2 * r - 1; i++) {
            for (int j = 1; j <= 2 * r - 1; j++) {
                int a = (i <= r) ? i : 2 * r - i;
                int b = (j <= r) ? j : 2 * r - j;
                System.out.print(Math.min(a, b) + " ");
            }
            System.out.println();
        }
    }
}