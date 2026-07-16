import java.util.Scanner;

public class GPseries {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of terms: ");
        int n = sc.nextInt();

        int a = 1; 
        int r = 2;

        System.out.println("GP series: ");
        
        for(int i = 1; i <= n; i++){
            System.out.print(a + " ");
            a *= r;
        }
    }
}