/*
1 1 1 1 1 1 
2 2 2 2 2 2 
3 3 3 3 3 3 
4 4 4 4 4 4 
5 5 5 5 5 5 
6 6 6 6 6 6 

*/

import java.util.Scanner;

public class RowNumberPattern {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
      
        
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }

        sc.close();
    }

    
}
