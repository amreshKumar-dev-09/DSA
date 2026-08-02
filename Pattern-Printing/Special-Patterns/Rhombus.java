/*
number of rows: 5

        * * * * * 
      * * * * * 
    * * * * * 
  * * * * * 
* * * * * 

*/

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        sc.close();

        if (r <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        for (int i = 1; i <= r; i++) {

            // print spaces
            for (int j = 1; j <= r - i; j++) {
                System.out.print("  "); // fixed spacing
            }

            // print stars
            for (int j = 1; j <= r; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}