/*
Enter number of rows: 5

* * * * * * * * * 
  * * * * * * * 
    * * * * * 
      * * * 
        * 
        * 
*/

import java.util.Scanner;

public class InvertedPyramid {
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();

        sc.close();


        if (r <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

        for (int i = r; i >= 1; i--) {

            // print spaces (decreasing)
            for (int j = 1; j <= r-i; j++) {
                System.out.print("  ");
            }

            // print stars
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("* ");
            }

            System.out.println();

    }
     
        }
    }

