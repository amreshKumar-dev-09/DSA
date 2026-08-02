/* 
* * * *  * * * *
* * *      * * *
* *          * *
*              *
*              *
* *          * *
* * *      * * *
* * * *  * * * *
 */
import java.util.Scanner;

public class ButterflyPattern {    
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int sp = 0;

        for(int i = 1; i <= n; i++){

            // Left triangle
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("* ");
            }

            // Spaces (middle gap)
            for(int j = 1; j <= sp; j++){
                System.out.print("  ");   
            }

            // Right triangle
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("* ");
            }

            sp += 2;
            System.out.println();
        }

        for(int i = 1; i <= n; i++){

            // Left triangle
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            // Spaces
            for (int j = 1; j <= 2*(n-i); j++){
                System.out.print("  ");
            }

            // Right triangle
             for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }


    }
}
    

