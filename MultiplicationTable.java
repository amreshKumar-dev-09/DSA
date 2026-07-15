import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String a[]){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to generate it's table: ");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++){
            int result = n*i;
            
                System.out.println(n+" * "+i+" = "+result);
        }

        sc.close();
    }
}