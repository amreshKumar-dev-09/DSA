import java.util.Scanner;

public class StarPlus {
    public static void main(String a[])
    {
     Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) 
        {
            System.out.println("Please enter a positive number");
        }

        for(int i = 1; i <= rows; i++)
        {
            for(int j = 1; j <= cols ; j++)
            {

                if(i == (rows+1)/2 || j == (cols+1)/2)
                System.out.print("* ");
            
            else 
                System.out.print("# ");
            }
            System.out.println();

        }
    }
    
}
