import java.util.Scanner;

public class Bridge {
     public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int r = sc.nextInt();

        sc.close();

        if (r <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }

         for(int i = 1; i <= 2*r-1; i++){
            System.out.print("* ");
         }
         System.out.println();

            int nsp = 1;

        for (int i = 1; i <= r - 1; i++) {

            int k = r - i; // stars on each side, decreasing

            // print left stars
            for (int j = 1; j <= k; j++) {
                System.out.print("* ");
            }

            // print gap (increasing)
            for (int j = 1; j <= nsp; j++) {
                System.out.print(" " + " ");
            }

            // print right stars
            for (int j = 1; j <= k; j++){
             System.out.print("*"+" ");
            }

            nsp +=2;
         System.out.println();
        }
        

    }
    
}

/*
* * * * * * * * * 
* * * *   * * * *
* * *       * * *
* *           * * 
*               *
*/
