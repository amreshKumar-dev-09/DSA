/*
        * 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        *  
 */

import java.util.Scanner;

public class Diamond {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        sc.close();

        int nsp = r - 1;
        int nst = 1;

        if (r <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        for (int i = 1; i <= r; i++) {

            // print spaces (decreasing)
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp -= 1;
            nst += 2;
            System.out.println();
        }

        nsp = 1;
        nst = 2 * r - 3;

         for (int i = 1; i <= r; i++) {

            // print spaces (decreasing)
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp++;
            nst -= 2;
            System.out.println();
        }





    }
}
