/*

A
1 2
A B C
1 2 3 4
A B C D E
1 2 3 4 5 6
A B C D E F G
1 2 3 4 5 6 7 8 

*/



import java.util.Scanner;

public class AlphaNumericTriangle {
     public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        if (rows <= 0) {
            System.out.println("Please enter a positive number");
        }

        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                if(i % 2 == 1)
                    System.out.print((char)(j+64) + " ");
            else
                System.out.print(j + " ");
                
            }
            System.out.println();
            
        }

        sc.close();
    
    }
    
}
