import java.util.Scanner;

public class StarAlphabet {
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of rows: ");
        int r = sc.nextInt();

        System.out.println("Enter number of columns: ");
        int c = sc.nextInt();
      
        
        for(int i = 1; i <= r; i++){
            for(int j = 1; j <= c; j++){
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
    
}
